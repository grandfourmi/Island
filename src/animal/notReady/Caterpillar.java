package animal.notReady;

import configurations.service.Animal;
import animal.Interfaces.Herbivores;

public class Caterpillar extends Animal implements Herbivores {

    static double FULLNESS = 0;
    static int SPEED = 0;
    static int MAX_QUANTITY = 1000;

    public Caterpillar() {
        weightHP = 0.01;

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
