package configurations.service;

import field.Cell;
import field.Island;

import java.util.Random;


public abstract class Animal {
    public int maxAmount;
    protected String name;
    protected double weight;
    protected int speed;
    protected double fullness;

    protected int x;
    protected int y;

    public Animal(int x, int y) {
        ConfigLoader.load(this);
        this.x = x;
        this.y = y;
    }


    public synchronized void moving(Island island) {
        Random random = new Random();

        int steps = random.nextInt(speed) ;
        int dx = random.nextInt(3) - 1;
        int dy = random.nextInt(3) - 1;

        if (dx == 0 && dy == 0) return;

        int newX = x + dx * steps;
        int newY = y + dy * steps;


        if (newX < 0 || newX >= island.getWidth() ||
                newY < 0 || newY >= island.getHeight()) {
            return;
        }

        Cell current = island.getCell(x, y);
        Cell target = island.getCell(newX, newY);


        if (!target.tryAddAnimal(this)) {
            return;
        }


        current.removeAnimal(this);

        this.x = newX;
        this.y = newY;

        target.tryAddAnimal(this);

        System.out.println(name + " moved to (" + x + "," + y + ")");
    }
    public Animal makingLove() {
        return null;
    }
    public void eating() {

    }
}