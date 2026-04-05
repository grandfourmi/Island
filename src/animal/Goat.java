package animal;


import animal.Interfaces.Herbivores;

public class Goat extends Animal implements Herbivores {

    static double FULLNESS = 10;
    static int SPEED = 3;
    static int MAX_QUANTITY = 140;


    public Goat() {
        weight = 60.0;

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
