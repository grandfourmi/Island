package simulation.phases;

import animal.Animal;
import field.Cell;
import field.Island;
import simulation.TickStats;

import java.util.HashMap;
import java.util.Map;

public class Statistics {

    public static void print(Island island, TickStats stats) {

        Map<String, Integer> statsMap = new HashMap<>();

        int totalPlants = 0;
        int cellsCount = island.getWidth() * island.getHeight();

        for (int x = 0; x < island.getWidth(); x++) {
            for (int y = 0; y < island.getHeight(); y++) {

                Cell cell = island.getCell(x, y);

                // считаем животных
                for (Animal animal : cell.getAnimals()) {
                    String name = animal.getClass().getSimpleName();
                    statsMap.put(name, statsMap.getOrDefault(name, 0) + 1);
                }

                // считаем растения
                totalPlants += cell.getPlantCount();
            }
        }

        // среднее количество растений на клетку
        int avgPlants = totalPlants / cellsCount;

        String level;
        if (avgPlants >= 180) level = "VERY HIGH";
        else if (avgPlants >= 150) level = "HIGH";
        else if (avgPlants >= 100) level = "MEDIUM";
        else level = "LOW";

        // вывод
        System.out.println("===== WORLD STATS =====");

        statsMap.forEach((k, v) -> System.out.println(k + ": " + v));

        System.out.println("Eaten: " + stats.eaten.get());
        System.out.println("Starved: " + stats.starved.get());
        System.out.println("Plants level: " + level);

        System.out.println("=======================");
    }
}