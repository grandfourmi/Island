package animal;

import animal.Interfaces.Herbivores;

public class Deer extends Animal implements Herbivores {

    static double FULLNESS = 50;
    static int SPEED = 4;
    static int MAX_QUANTITY = 20;


    public Deer() {
        weight = 300.0;

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
