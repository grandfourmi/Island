import configurations.loader.EatConfig;
import configurations.loader.EatConfigLoader;
import logic.EatingLogic;

public class IslandApp {


    public static void main(String[] args) {

        EatConfig config = EatConfigLoader.load();
        EatingLogic eatingLogic = new EatingLogic(config);

    }

}
