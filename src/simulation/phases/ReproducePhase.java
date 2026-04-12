package simulation.phases;

import animal.Animal;
import field.Cell;
import field.Island;
import simulation.TickStats;


public class ReproducePhase implements Phase {

    private final Island island;

    public ReproducePhase(Island island) {
        this.island = island;
    }


    @Override
    public void process(Cell cell, TickStats tickStats) {
        for (Animal animal : cell.getAnimals()) {
            animal.reproduce(island);
        }
    }
}