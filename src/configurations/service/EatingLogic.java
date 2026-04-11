package configurations.service;

import field.Cell;

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

    public void eat(Animal predator, Cell cell) {

        String predatorType = predator.getClass().getSimpleName().toUpperCase();

        Map<String, Integer> preyMap =
                rules.eatMap.getOrDefault(predatorType, new HashMap<>());

        if (preyMap.isEmpty()) return;

        List<Animal> candidates = cell.getAnimals().stream()
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

            predator.healthPoints += prey.weight;

            System.out.println(predator.name + " ate " + preyType);
        }
    }
}