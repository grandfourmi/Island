package animal;

import animal.Interfaces.Herbivores;

public class Caterpillar extends Animal implements Herbivores {

    static double FULLNESS = 0;
    static int SPEED = 0;
    static int MAX_QUANTITY = 1000;

    public Caterpillar() {
        weight = 0.01;

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
