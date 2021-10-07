public class Cat extends Tamagotchi{

        // Constructor
    public Cat(String name, int happiness, int energy, int hunger, int tiredness){
        this.name = name;
        this.happiness = happiness;
        this.energy = energy;
        this.hunger = hunger;
        this.tiredness = tiredness;
    }


    @Override
    public void play() {
        System.out.println("You pull out your laser pointer and start playing with "
                + this.name +
                ". Is it getting tired, or just tired of you?");

    }

    @Override
    public void feed() {
        System.out.println("You feed the cat some biscuits.\nIt's jumping in joy!");
    }

    @Override
    public void sleep() {
        System.out.println("The cat is now sleeping. It's now full of energy!");
    }

    @Override
    public void makeSound() {
        System.out.println("Meow");
    }

    String catArt =
            "####" +
            "#o#o##\n" +
            "##V###\n" +
            "########\n" +
            "#v###v##";
}
