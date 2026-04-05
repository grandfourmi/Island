package animal;

import animal.Interfaces.Herbivores;

// Это кабан
public class Boar extends Animal implements Herbivores {

    static double FULLNESS = 50;
    static int SPEED = 2;
    static int MAX_QUANTITY = 50;


    public Boar() {
        weight = 400.0;

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
