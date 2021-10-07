public abstract class Tamagotchi {

    protected String name;
    protected int happiness;
    protected int energy;
    protected int hunger;
    protected int tiredness;

    public abstract void play();
    public abstract void feed();
    public abstract void sleep();
    public abstract void makeSound();
}
