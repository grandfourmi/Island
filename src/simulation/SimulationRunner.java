package simulation;

import simulation.phases.*;
import field.Island;
import grass.PlantGrowthLogic;

public class SimulationRunner {

    private final Island island;
    private final PhaseExecutor executor;
    private final MovePhase movePhase;
    private final EatPhase eatPhase;
    private final ReproducePhase reproducePhase;
    private final StarvationPhase starvationPhase;

    private final PlantGrowthLogic plantGrowth = new PlantGrowthLogic();

    public SimulationRunner(Island island) {
        this.island = island;
        int threads = Runtime.getRuntime().availableProcessors();
        this.executor = new PhaseExecutor(island, threads);
        this.movePhase = new MovePhase(island);
        this.eatPhase = new EatPhase();
        this.reproducePhase = new ReproducePhase(island);
        this.starvationPhase = new StarvationPhase();
    }

    public void start() throws InterruptedException {

        int tick = 0;

        while (true) {
            tick++;

            TickStats stats = new TickStats();

            runPhases(stats);

            plantGrowth.grow(island, 5);

            System.out.println("TICK: " + tick);
            Statistics.print(island, stats);

            Thread.sleep(1500);
        }
    }

    private void runPhases(TickStats stats) throws InterruptedException {
        executor.execute(movePhase, stats);
        executor.execute(eatPhase, stats);
        executor.execute(reproducePhase, stats);
        executor.execute(starvationPhase, stats);
    }
}