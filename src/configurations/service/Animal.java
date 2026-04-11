package configurations.service;

import field.Cell;
import field.Island;

public abstract class Animal {


    public int maxAmount;
    protected String name;
    protected double weight;
    protected double healthPoints;
    protected int speed;
    protected double fullness;



    protected int x;
    protected int y;

    private static final MovementLogic MOVEMENT = new MovementLogic();
    private static final MakingLoveLogic MAKING_LOVE = new MakingLoveLogic();
    private static final EatingLogic EATING_LOGIC = new EatingLogic(EatConfigLoader.load());

    public Animal(int x, int y) {
        ConfigLoader.load(this);
        this.healthPoints = this.weight;
        this.x = x;
        this.y = y;
    }

    public void move(Island island) {
        if (MOVEMENT != null) {
            MOVEMENT.move(this, island);
        }
    }
    public void reproduce(Island island) {
        MAKING_LOVE.makingLove(this, island);
    }

    public void eat(Animal animal, Cell cell) {
       EATING_LOGIC.eat(animal, cell);
    }
}