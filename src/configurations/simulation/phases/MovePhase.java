package configurations.simulation.phases;

import configurations.service.Animal;
import field.Cell;
import field.Island;

public class MovePhase implements Phase {

    private final Island island;

    public MovePhase(Island island) {
        this.island = island;
    }

    @Override
    public void process(Cell cell) {
        for (Animal animal : cell.getAnimals()) {
            animal.move(island);
        }
    }
}