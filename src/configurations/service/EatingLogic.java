package configurations.service;

import field.Cell;
import grass.Plant;

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

    public void eat(Animal animal, Cell cell) {

        String animalType = animal.getClass().getSimpleName().toUpperCase();

        Map<String, Integer> preyMap =
                rules.eatMap.getOrDefault(animalType, new HashMap<>());

        if (preyMap.isEmpty()) return;


        if (preyMap.containsKey("PLANT") && cell.getPlantCount() > 0) {

            cell.consumePlant();

            double eaten = Math.min(Plant.WEIGHT, animal.fullness);
            animal.healthPoints += eaten;

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
                ThreadLocalRandom.current().nextInt(candidates.size())
        );

        String preyType = prey.getClass().getSimpleName().toUpperCase();
        int chance = preyMap.getOrDefault(preyType, 0);

        if (ThreadLocalRandom.current().nextInt(100) < chance) {

            cell.removeAnimal(prey);

            double eaten = Math.min(prey.weight, animal.fullness);
            animal.healthPoints += eaten;

        }
    }
}