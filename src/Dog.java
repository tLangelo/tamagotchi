public class Dog extends Tamagotchi{
    @Override
    public void play() {

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
