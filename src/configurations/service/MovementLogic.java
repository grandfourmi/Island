package configurations.service;

import field.Cell;
import field.Island;
import java.util.concurrent.ThreadLocalRandom;


public class MovementLogic {

    public void move(Animal animal,Island island) {
        int steps = ThreadLocalRandom.current().nextInt(animal.speed) ;
        int dx = ThreadLocalRandom.current().nextInt(3) - 1;
        int dy = ThreadLocalRandom.current().nextInt(3) - 1;

        if (dx == 0 && dy == 0) return;

        int newX = animal.x + dx * steps;
        int newY = animal.y + dy * steps;


        if (newX < 0 || newX >= island.getWidth() ||
                newY < 0 || newY >= island.getHeight()) {
            return;
        }

        Cell current = island.getCell(animal.x, animal.y);
        Cell target = island.getCell(newX, newY);


        if (!target.tryAddAnimal(animal)) {
            return;
        }


        current.removeAnimal(animal);

        animal.x = newX;
        animal.y = newY;


        System.out.println(animal.name + " moved to (" + animal.x + "," + animal.y + ")");
    }
}
