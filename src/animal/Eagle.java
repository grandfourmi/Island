package animal;

import animal.Interfaces.Carnivorous;


public class Eagle extends Animal implements Carnivorous {

    static double FULLNESS = 1;
    static int SPEED = 3;
    static int MAX_QUANTITY = 20;



    public Eagle() {
        weight = 6.0;

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
