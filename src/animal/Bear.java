package animal;

import animal.Interfaces.Carnivorous;

public class Bear extends Animal implements Carnivorous {

    static double FULLNESS = 8;
    static int SPEED = 2;
    static int MAX_QUANTITY = 80;

    public Bear() {
        weight = 500;

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
