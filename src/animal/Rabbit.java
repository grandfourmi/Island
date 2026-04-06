package animal;

import animal.Interfaces.Herbivores;
import configurations.annotation.ConfigAnimals;
import configurations.service.Animal;
import configurations.service.ConfigLoader;

@ConfigAnimals(fileName  = "configurations/Rabbit.yaml")
public class Rabbit extends Animal implements Herbivores {

    public Rabbit(int x, int y) {
        super(x, y);
    }


}
