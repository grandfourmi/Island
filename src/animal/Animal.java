package animal;

import configurations.loader.AnimalConfig;
import configurations.loader.ConfigLoader;
import configurations.loader.EatConfigLoader;
import field.Cell;
import field.Island;
import logic.EatingLogic;
import logic.MakingLoveLogic;
import logic.MovementLogic;
import simulation.TickStats;

public abstract class Animal {

    private int maxAmount;
    private String name;
    private double weight;
    private double healthPoints;
    private int speed;
    private double fullness;

    private int x;
    private int y;

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
        MOVEMENT.move(this, island);
    }

    public void reproduce(Island island) {
        MAKING_LOVE.makingLove(this, island);
    }

    public void eat(Cell cell, TickStats stats) {
        EATING_LOGIC.eat(this, cell, stats);
    }


    public double getHealthPoints() {
        return healthPoints;
    }

    public void setHealthPoints(double healthPoints) {
        this.healthPoints = healthPoints;
    }

    public double getFullness() {
        return fullness;
    }

    public double getWeight() {
        return weight;
    }

    public int getSpeed() {
        return speed;
    }

    public int getMaxAmount() {
        return maxAmount;
    }

    public String getName() {
        return name;
    }

    public void applyConfig(AnimalConfig cfg) {
        this.name = cfg.name;
        this.weight = cfg.weight;
        this.maxAmount = cfg.maxAmount;
        this.speed = cfg.speed;
        this.fullness = cfg.fullness;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setPosition(int x, int y) {
        this.x = x;
        this.y = y;
    }
}