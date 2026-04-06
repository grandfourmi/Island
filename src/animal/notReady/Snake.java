package animal.notReady;

import configurations.service.Animal;
import animal.Interfaces.Carnivorous;

public class Snake extends Animal implements Carnivorous {

    static double FULLNESS = 3;
    static int SPEED = 1;
    static int MAX_QUANTITY = 30;


    public Snake() {
        weightHP = 15.0;

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
