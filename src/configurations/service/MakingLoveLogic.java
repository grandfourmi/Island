package configurations.service;

import field.Cell;
import field.Island;

public class MakingLoveLogic {

    public void makingLove( Animal animal,Island island) {
        if (animal.weight != animal.healthPoints) return;

        Cell current = island.getCell(animal.x, animal.y);

        synchronized (current) {
            int count = current.getCountOfType(animal.getClass());

            if (count > 1) {
                try {
                    if (current.getCountOfType(animal.getClass()) < animal.maxAmount) {
                        Animal baby = animal.getClass()
                                .getDeclaredConstructor(int.class, int.class)
                                .newInstance(animal.x, animal.y);
                        current.tryAddAnimal(baby);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                    //Todo прикрутить логирование
                }
            }
        }

    }
}
