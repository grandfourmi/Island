package animal;

import animal.Interfaces.Herbivores;

public class Horse extends Animal implements Herbivores {

    static double FULLNESS = 60;
    static int SPEED = 4;
    static int MAX_QUANTITY = 20;


    public Horse() {
        weight = 400.0;

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
