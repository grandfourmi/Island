package animal;

import configurations.annotation.ConfigAnimals;

@ConfigAnimals(fileName = "configurations/Goat.yaml")
public class Goat extends Animal {
    public Goat(int x, int y) {
        super(x, y);
    }
}
