package animal;

import animal.Interfaces.Carnivorous;
import animal.Interfaces.Herbivores;
import configurations.annotation.ConfigAnimals;
import configurations.service.Animal;
import configurations.service.ConfigLoader;

@ConfigAnimals(fileName  = "configurations/Duck.yaml")
public class Duck extends Animal implements Herbivores, Carnivorous {

    public Duck(int x, int y) {
        super(x, y);
    }
}
