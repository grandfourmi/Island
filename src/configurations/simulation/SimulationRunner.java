package configurations.simulation;

import configurations.simulation.phases.*;
import field.Island;
import grass.PlantGrowthLogic;

public class SimulationRunner {

    private final Island island;
    private final PhaseExecutor executor;

    private final PlantGrowthLogic plantGrowth = new PlantGrowthLogic();

    public SimulationRunner(Island island) {
        this.island = island;
        int threads = Runtime.getRuntime().availableProcessors();
        this.executor = new PhaseExecutor(island, threads);
    }

    public void start() throws InterruptedException {

        int tick = 0;

        while (true) {
            tick++;

            executor.execute(new MovePhase(island));
            executor.execute(new EatPhase());
            executor.execute(new ReproducePhase(island));
            executor.execute(new StarvationPhase());

            plantGrowth.grow(island, 5);

            System.out.println("TICK: " + tick);
            Statistics.print(island);

            Thread.sleep(1500);
        }
    }
}