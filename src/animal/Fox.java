package animal;

import animal.Interfaces.Carnivorous;

public class Fox extends Animal implements Carnivorous {

    static double FULLNESS = 2;
    static int SPEED = 2;
    static int MAX_QUANTITY = 30;


    public Fox() {
        weight = 8.0;

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
