package grass;

import field.Cell;
import field.Island;

public class PlantGrowthLogic {
    public void grow(Island island, int growthRate) {
        for (int x = 0; x < island.getWidth(); x++) {
            for (int y = 0; y < island.getHeight(); y++) {
                Cell cell = island.getCell(x, y);
                cell.addPlant(growthRate);
            }
        }
    }
}