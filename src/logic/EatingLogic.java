package logic;

import configurations.loader.EatConfig;
import animal.Animal;
import field.Cell;
import grass.Plant;
import simulation.TickStats;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Collectors;

public class EatingLogic {
    private final EatConfig rules;

    public EatingLogic(EatConfig rules) {

        this.rules = rules;
    }

    public void eat(Animal animal, Cell cell, TickStats stats) {

        String animalType = animal.getClass().getSimpleName().toUpperCase();

        Map<String, Integer> preyMap =
                rules.eatMap.getOrDefault(animalType, new HashMap<>());

        if (preyMap.isEmpty()) return;

        if (preyMap.containsKey("PLANT") && cell.getPlantCount() > 0) {

            if (cell.consumePlant()) {
                double eaten = Math.min(Plant.WEIGHT, animal.getFullness());
                animal.setHealthPoints(animal.getHealthPoints() + eaten);
            }
            return;
        }

        List<Animal> candidates = cell.getAnimals().stream()
                .filter(a -> a != animal)
                .filter(a -> preyMap.containsKey(
                        a.getClass().getSimpleName().toUpperCase()
                ))
                .collect(Collectors.toList());

        if (candidates.isEmpty()) return;

        Animal prey = candidates.get(
                ThreadLocalRandom.current().nextInt(candidates.size()));

        String preyType = prey.getClass().getSimpleName().toUpperCase();
        int chance = preyMap.getOrDefault(preyType, 0);

        if (ThreadLocalRandom.current().nextInt(100) < chance) {

            cell.removeAnimal(prey);

            stats.eaten.incrementAndGet();

            double eaten = Math.min(prey.getWeight(), animal.getFullness());
            animal.setHealthPoints(animal.getHealthPoints() + eaten);

        }
    }
}