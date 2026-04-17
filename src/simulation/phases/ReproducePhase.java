package simulation.phases;

import animal.Animal;
import field.Cell;
import field.Island;
import simulation.TickStats;

import java.util.ArrayList;


public class ReproducePhase implements Phase {

    private final Island island;

    public ReproducePhase(Island island) {
        this.island = island;
    }


    @Override
    public void process(Cell cell, TickStats tickStats) {
        for (Animal animal : new ArrayList<>(cell.getAnimals())) {
            animal.reproduce(island);
        }
    }
}