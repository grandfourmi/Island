package animal;

import configurations.annotation.ConfigAnimals;

@ConfigAnimals(fileName = "configurations/Deer.yaml")
public class Deer extends Animal {
    public Deer(int x, int y) {
        super(x, y);
    }
}
