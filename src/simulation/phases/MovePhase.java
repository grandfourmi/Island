package simulation.phases;

import animal.Animal;
import field.Cell;
import field.Island;
import simulation.TickStats;

import java.util.ArrayList;

public class MovePhase implements Phase {

    private final Island island;

    public MovePhase(Island island) {
        this.island = island;
    }

    @Override
    public void process(Cell cell, TickStats stats) {
        for (Animal animal : new ArrayList<>(cell.getAnimals())) {
            animal.move(island);
        }
    }
}