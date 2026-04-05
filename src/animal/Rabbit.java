package animal;

import animal.Interfaces.Herbivores;

public class Rabbit extends Animal implements Herbivores {

    static double FULLNESS = 0.45;
    static int SPEED = 2;
    static int MAX_QUANTITY = 150;

    public Rabbit() {
        weight = 2.0;
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
