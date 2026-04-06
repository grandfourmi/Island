package animal.notReady;

import configurations.service.Animal;
import animal.Interfaces.Herbivores;

public class Sheep extends Animal implements Herbivores {

    static double FULLNESS = 70;
    static int SPEED = 3;
    static int MAX_QUANTITY = 140;

    public Sheep() {
        weightHP = 70.0;

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
