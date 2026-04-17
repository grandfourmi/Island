package simulation;

import animal.Animal;
import field.Cell;
import field.Island;

import java.util.Map;
import java.util.concurrent.ThreadLocalRandom;

public class AnimalSpawner {

    public void spawn(Island island, SimulationConfig config) {

        for (Map.Entry<Class<? extends Animal>, Integer> entry : config.animalCounts.entrySet()) {

            Class<? extends Animal> clazz = entry.getKey();
            int count = entry.getValue();

            for (int i = 0; i < count; i++) {

                int x = ThreadLocalRandom.current().nextInt(island.getWidth());
                int y = ThreadLocalRandom.current().nextInt(island.getHeight());

                try {
                    Animal animal = clazz
                            .getDeclaredConstructor(int.class, int.class)
                            .newInstance(x, y);

                    Cell cell = island.getCell(x, y);
                    cell.tryAddAnimal(animal);

                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }
}