package animal;

import animal.Interfaces.Herbivores;

public class Sheep extends Animal implements Herbivores {

    static double FULLNESS = 70;
    static int SPEED = 3;
    static int MAX_QUANTITY = 140;

    public Sheep() {
        weight = 70.0;

    }

    @Override
    void moving() {

    }

    @Override
    void setWeight(double weight) {

    }

    @Override
    public void run() {

    }
}
