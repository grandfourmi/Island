package simulation.phases;

import animal.Animal;
import field.Cell;
import simulation.TickStats;

import java.util.ArrayList;

public class StarvationPhase implements Phase {

    @Override
    public void process(Cell cell, TickStats stats) {

        for (Animal animal : new ArrayList<>(cell.getAnimals())) {
            double newHp = animal.getHealthPoints() - animal.getFullness() / 2;

            if (newHp <= 0) {
                cell.removeAnimal(animal);
                stats.starved.incrementAndGet();
            } else {
                animal.setHealthPoints(newHp);
            }
        }
    }
}