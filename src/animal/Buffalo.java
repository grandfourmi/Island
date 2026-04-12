package animal;

import configurations.annotation.ConfigAnimals;

@ConfigAnimals(fileName = "configurations/Buffalo.yaml")
public class Buffalo extends Animal {
    public Buffalo(int x, int y) {
        super(x, y);
    }
}
