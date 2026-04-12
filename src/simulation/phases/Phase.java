package simulation.phases;

import field.Cell;
import simulation.TickStats;

public interface Phase {
    void process(Cell cell, TickStats tickStats);
}