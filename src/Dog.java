public class Dog extends Tamagotchi{

    // Constructor
    public Dog(String name, int happiness, int energy, int hunger, int tiredness) {
        this.name = name;
        this.happiness = happiness;
        this.energy = energy;
        this.hunger = hunger;
    }

    //Methods
    @Override
    public void play() {
        System.out.println("You play around with " + this.name + "");

        if (this.energy >= 2 && this.hunger >= 1)
        {
            this.addHappiness(1);
            this.addHEnergy(-2);
            this.addHunger(-1);
        }
        else
        {
            System.out.println(this.name + " needs to sleep..");
            addHappiness(-3);
            addHunger(-1);
        }

    }

    @Override
    public void feed() {
        System.out.println("You feed the dog some food. You can tell it's getting happier");
        addHunger(2);
        addHappiness(1);
    }

    @Override
    public void sleep() {
        //sleep animation
        for (int i = 0; i < 5; i++)
        {
            try {
                System.out.print("Z");
                Thread.sleep(600);
            }
            catch (IllegalArgumentException | InterruptedException e)
            {
                System.out.println("Failed to sleep.");
            }
        }

        System.out.println();
        System.out.println("Your dog is sleeping. It's now full of energy!");
        addHEnergy(4);
        addHunger(-4);
    }

    @Override
    public void makeSound() {
        System.out.println("Bark, bark!");
        addHEnergy(1);
    }
}
