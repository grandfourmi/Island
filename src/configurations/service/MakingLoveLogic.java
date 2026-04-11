package configurations.service;

import field.Cell;
import field.Island;

public class MakingLoveLogic {

    public void makingLove( Animal animal,Island island) {
        if (animal.healthPoints < animal.weight * 0.99) return;

        Cell current = island.getCell(animal.x, animal.y);

        synchronized (current) {
            int count = current.getAnimalsByType(animal.getClass()).size();

            if (count > 1 && count < animal.maxAmount) {
                try {
                        Animal baby = animal.getClass()
                                .getDeclaredConstructor(int.class, int.class)
                                .newInstance(animal.x, animal.y);

                        current.tryAddAnimal(baby);

                } catch (Exception e) {
                    e.printStackTrace();
                    //Todo прикрутить логирование
                }
            }
        }

    }
}
