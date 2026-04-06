package field;

import configurations.service.Animal;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Cell {

    private final int x;
    private final int y;
    private final Map<Class <? extends Animal>,Integer> listAnimals = new ConcurrentHashMap<>();

    public Cell(int x, int y) {
        this.x = x;
        this.y = y;

    }

    public synchronized boolean tryAddAnimal(Animal animal) {
        int count = listAnimals.getOrDefault(animal.getClass(), 0);
        if (count >= animal.maxAmount) return false;
        listAnimals.put(animal.getClass(), count + 1);
        return true;
    }

    public synchronized void removeAnimal(Animal animal) {
        Class<? extends Animal> type = animal.getClass();
        int count = listAnimals.getOrDefault(type, 0);

        if (count <= 1) {
            listAnimals.remove(type);
        } else {
            listAnimals.put(type, count - 1);
        }
    }
}
