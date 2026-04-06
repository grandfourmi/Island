package configurations.service;

//public abstract class Animal implements Runnable{


//}
public abstract class Animal {
    protected String name;
    protected double weight;
    protected int maxAmount;
    protected int speed;
    protected double fullness;

    public abstract void moving();
    public abstract Animal makingLove();
    public abstract void eating();
}