package configurations.simulation;

import configurations.simulation.phases.Phase;
import field.Island;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class PhaseExecutor {

    private final Island island;
    private final ExecutorService executor;

    public PhaseExecutor(Island island, int threads) {
        this.island = island;
        this.executor = Executors.newFixedThreadPool(threads);
    }

    public void execute(Phase phase) throws InterruptedException {
        List<Callable<Void>> tasks = new ArrayList<>();

        for (int x = 0; x < island.getWidth(); x++) {
            int finalX = x;

            tasks.add(() -> {
                for (int y = 0; y < island.getHeight(); y++) {
                    phase.process(island.getCell(finalX, y));
                }
                return null;
            });
        }

        executor.invokeAll(tasks);
    }

    public void shutdown() {
        executor.shutdown();
    }
}