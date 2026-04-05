package animal;

import animal.Interfaces.Carnivorous;

public class Wolf extends Animal implements Carnivorous{

    static double FULLNESS = 8;
    static int SPEED = 3;
    static int MAX_QUANTITY = 30;

    public Wolf() {
        weight = 50.0;

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
