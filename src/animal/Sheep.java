package animal;

import configurations.annotation.ConfigAnimals;

@ConfigAnimals(fileName = "configurations/Sheep.yaml")
public class Sheep extends Animal {
    public Sheep(int x, int y) {
        super(x, y);
    }
}
