package animal;

import configurations.annotation.ConfigAnimals;

@ConfigAnimals(fileName = "configurations/Bear.yaml")
public class Bear extends Animal {

    public Bear(int x, int y) {
        super(x, y);
    }
}
