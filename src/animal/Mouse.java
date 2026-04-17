package animal;

import configurations.annotation.ConfigAnimals;

@ConfigAnimals(fileName = "configurations/Mouse.yaml")
public class Mouse extends Animal {
    public Mouse(int x, int y) {
        super(x, y);
    }
}
