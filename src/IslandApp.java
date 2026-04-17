import field.Island;
import simulation.AnimalSpawner;
import simulation.SimulationRunner;
import simulation.SimulationConfig;
import simulation.ui.ConsoleMenu;


public class IslandApp {

    public static void main(String[] args) {

        try {
            ConsoleMenu menu = new ConsoleMenu();
            SimulationConfig config = menu.init();

            Island island = new Island(config.width, config.height);

            AnimalSpawner spawner = new AnimalSpawner();
            spawner.spawn(island, config);

            SimulationRunner simulationRunner = new SimulationRunner(island, config);
            simulationRunner.start();

        } catch (InterruptedException e) {
            System.out.println("Симуляция остановлена");
            Thread.currentThread().interrupt();
        }
    }
}