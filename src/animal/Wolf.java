package animal;

import animal.Interfaces.Carnivorous;
import configurations.annotation.ConfigAnimals;
import configurations.service.Animal;
import configurations.service.ConfigLoader;


@ConfigAnimals(fileName  = "src/main/resources/configurations/Wolf.yaml")
public class Wolf extends Animal implements Carnivorous{

    public Wolf() {

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
