package animal;

import configurations.annotation.ConfigAnimals;

@ConfigAnimals(fileName = "configurations/Pig.yaml")
public class Pig extends Animal {
    public Pig(int x, int y) {
        super(x, y);
    }
}
