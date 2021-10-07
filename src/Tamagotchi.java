public abstract class Tamagotchi {

    protected String name;
    protected int happiness;
    protected int energy;
    protected int hunger;

    public abstract void play();
    public abstract void feed();
    public abstract void sleep();
    public abstract void makeSound();

        //Visual statbar
    public void printStatBar(String statName, int currentValue)
    {
        int diff = 10 - currentValue;

        System.out.print(statName + ": [");
        for (int i = 0; i < currentValue; i++)
        {
            System.out.print("#");
        }
        for (int i = 0; i < diff; i++)
        {
            System.out.print("-");
        }
        System.out.println("] (" + currentValue + ")");
    }

    public void printAllStats()
    {
        this.printStatBar("Happiness", this.happiness);
        this.printStatBar("Energy", this.energy);
        this.printStatBar("Hunger", this.hunger);
    }
        // method to clamp to make sure the cap is 0-10
    private int clamp(int statValue, int toAdd)
    {
        int result = statValue + toAdd;

        if (statValue + toAdd > 10)
        {
            result = 10;
        }

        if (statValue + toAdd < 0)
        {
            result = 0;
        }

        return result;
    }

    // Methods to add/subtract stats
    public void addHappiness(int statValue)
    {
        if (statValue < 0)
        {
            System.out.println(statValue + " happiness.");
            System.out.println(this.name + " is a little less happier now..");
        }
        else
        {
            System.out.println("+"+statValue + " happiness.");
            System.out.println(this.name + " is happier now!");
        }

        this.happiness = clamp(this.happiness, statValue);
    }

    public void addHEnergy(int statValue)
    {

        if (statValue < 0)
        {
            System.out.println(statValue + " energy.");
            System.out.println(this.name + " is getting tired..");
        }
        else
        {
            System.out.println("+"+statValue + " energy");
            System.out.println(this.name + " has more energy now!");
        }

        this.energy = clamp(this.energy, statValue);
    }

    public void addHunger(int statValue)
    {

        if (statValue < 0)
        {
            System.out.println(statValue + " hunger.");
            System.out.println(this.name + " is getting hungry..");
        }
        else
        {
            System.out.println("+"+statValue + " hunger");
            System.out.println(this.name + " is less hungry!");
        }

        this.hunger = clamp(this.hunger, statValue);
    }

    //Check if tamagotchi is dead
    public boolean isTamagotchiDeadYet()
    {
        return this.hunger == 0 && this.energy == 0 && this.happiness == 0;
    }

}