public class Cat extends Tamagotchi{

        // Constructor
    public Cat(String name, int happiness, int energy, int hunger, int tiredness){
        this.name = name;
        this.happiness = happiness;
        this.energy = energy;
        this.hunger = hunger;
    }


    @Override
    public void play() {
    //if statement to make cat less happy if it doesnt have the right stats
        if (this.energy >= 1 && this.hunger >= 3)
        {
            this.addHappiness(2);
            this.addHEnergy(-2);
            this.addHunger(-3);
        }
        else
        {
            System.out.println(this.name + " needs to sleep..");
            addHappiness(-3);
            addHunger(-1);
        }
        System.out.println("You pull out your laser pointer and start playing with "
                + this.name +
                ". \nIs it getting tired, or just tired of you?");


    }

    @Override
    public void feed() {
        System.out.println("You feed the cat some biscuits.\nIt's jumping in joy!");
        addHunger(5);
        addHappiness(2);
        addHEnergy(-1);
    }

    @Override
    public void sleep() {
        // making sleep animation
        System.out.println("Your cat is sleeping");
        for (int i = 0; i < 3; i++)
        {
            try {
                System.out.print("Z");
                Thread.sleep(300);
            }
            catch (IllegalArgumentException | InterruptedException e)
            {
                System.out.println("Failed to sleep.");
            }
        }

        System.out.println();
        System.out.println("It's now full of energy!");
        addHEnergy(6);
        addHunger(-4);
    }

    @Override
    public void makeSound() {
        System.out.println("Meow");
        addHappiness(-1);
    }
}
