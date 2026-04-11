package configurations.service;

import org.yaml.snakeyaml.Yaml;

import java.io.InputStream;

public class EatConfigLoader {

    public static EatConfig load() {

        InputStream input = EatConfigLoader.class
                .getClassLoader()
                .getResourceAsStream("configurations/eatMap.yaml");

        if (input == null) {
            // Todo проверку входных данных
        }
        Yaml yaml = new Yaml();
        return yaml.loadAs(input, EatConfig.class);
    }
}