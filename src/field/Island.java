package field;

public class Island {

    private final Cell[][] cells;

    public Island(int x, int y) {
        cells = new Cell[x][y];

        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                cells[i][j] = new Cell(i, j);
            }
        }
    }

    public Cell getCell(int x, int y) {

        return cells[x][y];
    }

    public int getWidth() {
        return cells.length;
    }

    public int getHeight() {
        return cells[0].length;
    }
}
