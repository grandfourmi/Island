package logic;

import animal.Animal;
import field.Cell;
import field.Island;

public class MakingLoveLogic {
    public void makingLove(Animal animal, Island island) {
        if (animal.getHealthPoints() < animal.getWeight() * 0.99) return;

        Cell current = island.getCell(animal.getX(), animal.getY());

        synchronized (current) {
            int count = current.getAnimalsByType(animal.getClass()).size();

            if (count > 1 && count < animal.getMaxAmount()) {
                try {
                    Animal baby = animal.getClass()
                            .getDeclaredConstructor(int.class, int.class)
                            .newInstance(animal.getX(), animal.getY());
                    current.tryAddAnimal(baby);

                } catch (Exception e) {
                    e.printStackTrace();
                    //прикрутить логирование
                }
            }
        }
    }
}
