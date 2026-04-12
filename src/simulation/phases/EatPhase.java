package simulation.phases;

import animal.Animal;
import field.Cell;
import simulation.TickStats;

public class EatPhase implements Phase {
    @Override
    public void process(Cell cell, TickStats stats) {
        for (Animal animal : cell.getAnimals()) {
            animal.eat(cell, stats);
        }
    }
}