package configurations.simulation.phases;

import configurations.service.Animal;
import field.Cell;

public class StarvationPhase implements Phase {

    @Override
    public void process(Cell cell) {

        for (Animal animal : cell.getAnimals()) {

            animal.healthPoints -= animal.fullness / 2;

            if (animal.healthPoints <= 0) {
                cell.removeAnimal(animal);
            }
        }
    }
}