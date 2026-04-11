package field;

import configurations.service.Animal;
import grass.Plant;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Cell {

    private final int x;
    private final int y;

    private int plantCount;

    private final Map<Class <? extends Animal>, List<Animal>> listAnimals = new ConcurrentHashMap<>();

    public Cell(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public synchronized boolean tryAddAnimal(Animal animal) {

        listAnimals.putIfAbsent(animal.getClass(),new ArrayList<>());

        List<Animal> animals = listAnimals.get(animal.getClass());

        if (animals.size() >= animal.maxAmount) return false;

        animals.add(animal);
        return true;

    }

    public synchronized void removeAnimal(Animal animal) {

        List<Animal> animals = listAnimals.get(animal.getClass());
        if (animals == null) return;

        animals.remove(animal);

        if (animals.isEmpty()) {
            listAnimals.remove(animal.getClass());
        }
    }

    public synchronized List<Animal> getAnimalsByType(Class<? extends Animal> aClass) {
        return listAnimals.getOrDefault(aClass, new ArrayList<>());
    }

    public synchronized List<Animal> getAnimals() {

        List<Animal> result = new ArrayList<>();

        for (List<Animal> list : listAnimals.values()) {
            result.addAll(list);
        }

        return result;
    }

    public synchronized int getPlantCount() {
        return plantCount;
    }

    public synchronized void addPlant(int amount) {
        plantCount = Math.min(plantCount + amount, Plant.MAX_QUANTITY);
    }

    public synchronized boolean consumePlant() {
        if (plantCount > 0) {
            plantCount--;
            return true;
        }
        return false;
    }
}
