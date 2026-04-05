package animal;

import animal.Interfaces.Carnivorous;
import animal.Interfaces.Herbivores;

public class Duck extends Animal implements Herbivores, Carnivorous {

    static double FULLNESS = 0.15;
    static int SPEED = 4;
    static int MAX_QUANTITY = 200;


    public Duck() {
        weight = 1.0;

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
