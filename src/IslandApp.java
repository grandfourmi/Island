import configurations.service.EatConfig;
import configurations.service.EatConfigLoader;
import configurations.service.EatingLogic;

public class IslandApp {


    public static void main(String[] args) {

        EatConfig config = EatConfigLoader.load();
        EatingLogic eatingLogic = new EatingLogic(config);

    }

}
