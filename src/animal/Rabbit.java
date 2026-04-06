package animal;

import animal.Interfaces.Herbivores;
import configurations.annotation.ConfigAnimals;
import configurations.service.Animal;
import configurations.service.ConfigLoader;

@ConfigAnimals(fileName  = "src/main/resources/configurations/Rabbit.yaml")
public class Rabbit extends Animal implements Herbivores {

    public Rabbit() {
        ConfigLoader.load(this);
    }

    @Override
    public void moving() {

    }

    @Override
    public Animal makingLove() {
        return null;
    }

    @Override
    public void eating() {

    }
}
