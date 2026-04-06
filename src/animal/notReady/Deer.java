package animal.notReady;

import configurations.service.Animal;
import animal.Interfaces.Herbivores;

public class Deer extends Animal implements Herbivores {

    static double FULLNESS = 50;
    static int SPEED = 4;
    static int MAX_QUANTITY = 20;


    public Deer() {
        weightHP = 300.0;

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
