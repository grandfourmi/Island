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

                for (Animal animal : cell.getAnimals()) {
                    String name = animal.getClass().getSimpleName();
                    statsMap.put(name, statsMap.getOrDefault(name, 0) + 1);
                }


                totalPlants += cell.getPlantCount();
            }
        }


        int avgPlants = totalPlants / cellsCount;

        String level;
        if (avgPlants >= 180) level = "Очень высокое";
        else if (avgPlants >= 150) level = "Высокое";
        else if (avgPlants >= 100) level = "Среднее";
        else level = "Низкое";


        System.out.println("===== Статистика Мира =====");

        statsMap.forEach((k, v) -> System.out.println(k + ": " + v));

        System.out.println("Съедены: " + stats.eaten.get());
        System.out.println("Умерли от голода : " + stats.starved.get());
        System.out.println("Уровень растительности: " + level);

        System.out.println("=======================");
    }
}