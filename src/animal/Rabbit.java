package animal;


import configurations.annotation.ConfigAnimals;
import configurations.service.Animal;


@ConfigAnimals(fileName  = "configurations/Rabbit.yaml")
public class Rabbit extends Animal {

    public Rabbit(int x, int y) {
        super(x, y);

    }


}
