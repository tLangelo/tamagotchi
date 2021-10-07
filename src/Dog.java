public class Dog extends Tamagotchi{

        // Constructor
    public Dog(String name, int happiness, int energy, int hunger, int tiredness) {
        this.name = name;
        this.happiness = happiness;
        this.energy = energy;
        this.hunger = hunger;
        this.tiredness = tiredness;
    }


    @Override
    public void play() {
        System.out.println("You play around with " + this.name + "");
    }

    @Override
    public void feed() {
        System.out.println("You feed the dog some food. You can tell it's getting happier");
    }

    @Override
    public void sleep() {
        System.out.println("Your dog is sleeping. It's now full of energy!");
    }

    @Override
    public void makeSound() {
        System.out.println("Bark, bark!");
    }
}
