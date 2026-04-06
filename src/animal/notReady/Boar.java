package animal.notReady;

import configurations.service.Animal;
import animal.Interfaces.Herbivores;

// Это кабан
public class Boar extends Animal implements Herbivores {

    static double FULLNESS = 50;
    static int SPEED = 2;
    static int MAX_QUANTITY = 50;


    public Boar() {
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
