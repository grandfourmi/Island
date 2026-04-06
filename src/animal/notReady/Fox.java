package animal.notReady;

import configurations.service.Animal;
import animal.Interfaces.Carnivorous;

public class Fox extends Animal implements Carnivorous {

    static double FULLNESS = 2;
    static int SPEED = 2;
    static int MAX_QUANTITY = 30;


    public Fox() {
        weightHP = 8.0;

    }

    @Override
    void moving() {

    }

    @Override
    void setWeightHP(double weightHP) {

    }

    @Override
    public void run() {

    }
}
