package configurations.simulation.phases;
import configurations.service.Animal;
import field.Cell;

public class EatPhase implements Phase {

    @Override
    public void process(Cell cell) {
        for (Animal animal : cell.getAnimals()) {
            animal.eat(animal, cell);
        }
    }
}