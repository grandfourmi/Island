package animal;

import configurations.annotation.ConfigAnimals;

@ConfigAnimals(fileName = "configurations/Horse.yaml")
public class Horse extends Animal {
    public Horse(int x, int y) {
        super(x, y);
    }
}
