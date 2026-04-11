package animal;

import configurations.annotation.ConfigAnimals;
import configurations.service.Animal;


@ConfigAnimals(fileName  = "configurations/Wolf.yaml")
public class Wolf extends Animal {


    public Wolf(int x, int y) {
        super(x, y);
    }

}
