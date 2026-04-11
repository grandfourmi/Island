package configurations.simulation.phases;

import field.Cell;

public interface Phase {
    void process(Cell cell);
}