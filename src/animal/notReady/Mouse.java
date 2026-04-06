package animal.notReady;

import configurations.service.Animal;
import animal.Interfaces.Herbivores;

public class Mouse extends Animal implements Herbivores {

    static double FULLNESS = 0.01;
    static int SPEED = 1;
    static int MAX_QUANTITY = 500;

    public Mouse() {
        weightHP = 0.05;

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
