package animal;

import animal.Interfaces.Herbivores;

public class Mouse extends Animal implements Herbivores {

    static double FULLNESS = 0.01;
    static int SPEED = 1;
    static int MAX_QUANTITY = 500;

    public Mouse() {
        weight = 0.05;

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
