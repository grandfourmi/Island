package animal;

import configurations.annotation.ConfigAnimals;

@ConfigAnimals(fileName = "configurations/Eagle.yaml")
public class Eagle extends Animal {
    public Eagle(int x, int y) {
        super(x, y);
    }
}
