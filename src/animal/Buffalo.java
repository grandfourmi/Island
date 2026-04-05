package animal;

import animal.Interfaces.Herbivores;

// Буйвол
public class Buffalo extends Animal implements Herbivores {

    static double FULLNESS = 100;
    static int SPEED = 10;
    static int MAX_QUANTITY = 10;

    public Buffalo() {
        weight = 700.0;
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
