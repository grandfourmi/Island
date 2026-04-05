package animal;

public abstract class Animal implements Runnable{

    boolean itAlive = true;
    double weight;

    abstract void moving();

    double getWeight() {
        return weight;
    }

    abstract void setWeight(double weight);

    Animal makeLove(Animal animal, int hungry ) {
        return null;
    }

    boolean isAlive() {
        return itAlive;
    }

    boolean setItAlive(boolean itAlive) {
        itAlive = false;
        return itAlive;
    }
}
