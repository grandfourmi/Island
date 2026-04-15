package simulation;
import java.util.Map;
import java.util.HashMap;
import animal.Animal;

public class SimulationConfig {

    public int width;
    public int height;
    public int plantGrowthRate;


    public Map<Class<? extends Animal>, Integer> animalCounts = new HashMap<>();
}