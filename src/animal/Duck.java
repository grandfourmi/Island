package animal;

import configurations.annotation.ConfigAnimals;
import configurations.service.Animal;



@ConfigAnimals(fileName  = "configurations/Duck.yaml")
public class Duck extends Animal  {

    public Duck(int x, int y) {
        super(x, y);

    }
}
