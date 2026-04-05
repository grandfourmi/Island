package field;

import java.util.ArrayList;
import java.util.List;

public class Island {

    private final Cell [][] cells ;
    private int x;
    private int y;

    public Island(int x, int y) {
        cells = new Cell[x][y];
        this.x = x;
        this.y = y;

        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                cells[i][j] = new Cell(i, j);
            }
        }
    }

    public Cell getCell(int x, int y) {
        return cells[x][y];
    }
}
