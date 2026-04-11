package configurations.simulation.phases;

import configurations.service.Animal;
import field.Cell;
import field.Island;


public class ReproducePhase implements Phase {

    private final Island island;

    public ReproducePhase(Island island) {
        this.island = island;
    }

    @Override
    public void process(Cell cell) {
        for (Animal animal : cell.getAnimals()) {
            animal.reproduce(island);
        }
    }
}