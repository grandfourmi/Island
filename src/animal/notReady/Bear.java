package animal.notReady;

import configurations.service.Animal;
import animal.Interfaces.Carnivorous;

public class Bear extends Animal implements Carnivorous {

    static final double FULLNESS = 8;
    static final int SPEED = 2;
    static final int MAX_QUANTITY = 80;
    static final int weight = 500;

    public Bear() {
        weightHP = 500;

    }

    @Override
    void moving() {

    }


    @Override
    void setWeightHP(double weightHP) {

    }

    @Override
    public void run() {
        moving();
        eatingMeat();
        if (weight == weightHP) {
            makingLove();
        }
    }
}
