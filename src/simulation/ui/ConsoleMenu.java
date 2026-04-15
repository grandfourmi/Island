package simulation.ui;

import animal.Animal;
import animal.AnimalRegistry;
import simulation.SimulationConfig;


public class ConsoleMenu {

    public SimulationConfig init() {

        SimulationConfig config = new SimulationConfig();

        System.out.println("=== Старт Windows 3.1 ===");

        System.out.print("Введите длину острова: ");
        config.width = Input.SCANNER.nextInt();

        System.out.print("Введите ширину острова: ");
        config.height = Input.SCANNER.nextInt();

        System.out.print("Введите интенсивность роста травы на острове: ");
        config.plantGrowthRate = Input.SCANNER.nextInt();

        for (Class<? extends Animal> clazz : AnimalRegistry.ANIMALS) {
            try {
                Animal animal = clazz
                        .getDeclaredConstructor(int.class, int.class)
                        .newInstance(0, 0);

                System.out.print("Введите количество " + animal.getName() + ": ");
                int count = Input.SCANNER.nextInt();

                config.animalCounts.put(clazz, count);

            } catch (Exception e) {
                e.printStackTrace();
            }
        }


        return config;
    }

}