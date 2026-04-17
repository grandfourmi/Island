package simulation;

import java.util.concurrent.atomic.AtomicInteger;

public class TickStats {

    public AtomicInteger eaten = new AtomicInteger(0);
    public AtomicInteger starved = new AtomicInteger(0);

}