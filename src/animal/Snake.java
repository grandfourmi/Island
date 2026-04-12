package animal;

import configurations.annotation.ConfigAnimals;

@ConfigAnimals(fileName = "configurations/Snake.yaml")
public class Snake extends Animal {
    public Snake(int x, int y) {
        super(x, y);
    }
}
