package animal.notReady;

import configurations.service.Animal;
import animal.Interfaces.Herbivores;

public class Horse extends Animal implements Herbivores {

    static double FULLNESS = 60;
    static int SPEED = 4;
    static int MAX_QUANTITY = 20;


    public Horse() {
        weightHP = 400.0;

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
