package animal;

import configurations.annotation.ConfigAnimals;

@ConfigAnimals(fileName = "configurations/Fox.yaml")
public class Fox extends Animal {
    public Fox(int x, int y) {
        super(x, y);
    }
}
