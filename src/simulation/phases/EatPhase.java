package simulation.phases;

import animal.Animal;
import field.Cell;
import simulation.TickStats;

import java.util.ArrayList;

public class EatPhase implements Phase {
    @Override
    public void process(Cell cell, TickStats stats) {
        for (Animal animal : new ArrayList<>(cell.getAnimals())) {
            animal.eat(cell, stats);
        }
    }
}