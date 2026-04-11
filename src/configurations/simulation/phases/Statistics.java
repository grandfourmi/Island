package configurations.simulation.phases;

import configurations.service.Animal;
import field.Cell;
import field.Island;

import java.util.HashMap;
import java.util.Map;

public class Statistics {

    public static void print(Island island) {

        Map<String, Integer> stats = new HashMap<>();

        for (int x = 0; x < island.getWidth(); x++) {
            for (int y = 0; y < island.getHeight(); y++) {

                Cell cell = island.getCell(x, y);

                for (Animal animal : cell.getAnimals()) {
                    String name = animal.getClass().getSimpleName();
                    stats.put(name, stats.getOrDefault(name, 0) + 1);
                }
            }
        }

        System.out.println("===== WORLD STATS =====");
        stats.forEach((k, v) -> System.out.println(k + ": " + v));
        System.out.println("=======================");
    }
}