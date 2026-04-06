package configurations.service;

import configurations.annotation.ConfigAnimals;
import org.yaml.snakeyaml.Yaml;
import java.io.InputStream;

public class ConfigLoader {
    public static <T extends Animal> void load(T animal) {
        ConfigAnimals configAnnotation = animal.getClass().getAnnotation(ConfigAnimals.class);
        if (configAnnotation == null) return;

        InputStream input = animal.getClass().getClassLoader().getResourceAsStream(configAnnotation.fileName());
        if (input == null) throw new RuntimeException("YAML file not found: " + configAnnotation.fileName());

        Yaml yaml = new Yaml();
        AnimalConfig cfg = yaml.loadAs(input, AnimalConfig.class);


        animal.name = cfg.name;
        animal.weight = cfg.weight;
        animal.maxAmount = cfg.maxAmount;
        animal.speed = cfg.speed;
        animal.fullness = cfg.fullness;
    }
}

