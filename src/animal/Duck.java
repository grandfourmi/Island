package animal;

import animal.Interfaces.Carnivorous;
import animal.Interfaces.Herbivores;
import configurations.annotation.ConfigAnimals;
import configurations.service.Animal;
import configurations.service.ConfigLoader;

@ConfigAnimals(fileName  = "src/main/resources/configurations/Duck.yaml")
public class Duck extends Animal implements Herbivores, Carnivorous {

    public Duck() {
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
