package field;

import animal.Animal;

import java.util.HashMap;
import java.util.Map;

public class Cell {

    private final int x;
    private final int y;
    private Map<Animal,Integer> listAnimals;  // как не хард кодить максимальное количество зверей?

    public Cell(int x, int y) {
        this.x = x;
        this.y = y;
        listAnimals = new HashMap<>();
    }

    public Map<Animal, Integer> getListAnimals() {
        return listAnimals;
    }

    public void setListAnimals(Map<Animal, Integer> listAnimals) {
        this.listAnimals = listAnimals;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

}
