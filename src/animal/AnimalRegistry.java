package animal;

import java.util.Arrays;
import java.util.List;

public class AnimalRegistry {

    public static final List<Class<? extends Animal>> ANIMALS = Arrays.asList(
            Bear.class,
            Buffalo.class,
            Caterpillar.class,
            Deer.class,
            Duck.class,
            Eagle.class,
            Fox.class,
            Goat.class,
            Horse.class,
            Mouse.class,
            Pig.class,
            Rabbit.class,
            Sheep.class,
            Snake.class,
            Wolf.class

    );

}
