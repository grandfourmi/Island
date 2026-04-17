package logic;

import animal.Animal;
import field.Cell;
import field.Island;
import java.util.concurrent.ThreadLocalRandom;

public class MovementLogic {

    public void move(Animal animal, Island island) {
        if (animal.getSpeed() <= 0) return;

        int steps = ThreadLocalRandom.current().nextInt(1, animal.getSpeed() + 1);
        int dx = ThreadLocalRandom.current().nextInt(3) - 1;
        int dy = ThreadLocalRandom.current().nextInt(3) - 1;

        if (dx == 0 && dy == 0) return;

        int newX = animal.getX() + dx * steps;
        int newY = animal.getY() + dy * steps;

        if (newX < 0 || newX >= island.getWidth() ||
                newY < 0 || newY >= island.getHeight()) {
            return;
        }

        Cell current = island.getCell(animal.getX(), animal.getY());
        Cell target = island.getCell(newX, newY);

        if (!target.tryAddAnimal(animal)) {
            return;
        }

        current.removeAnimal(animal);
        animal.setPosition(newX,newY);
    }
}
