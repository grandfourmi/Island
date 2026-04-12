package animal;

import configurations.annotation.ConfigAnimals;

@ConfigAnimals(fileName = "configurations/Caterpillar.yaml")
public class Caterpillar extends Animal {
    public Caterpillar(int x, int y) {
        super(x, y);
    }
}
