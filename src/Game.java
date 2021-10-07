import java.util.Scanner;

public class Game {
    static Scanner scan = new Scanner(System.in);
    static String nameOfTamagotchi = "";
    static String longLine = "-------------------";


            // GAME RUNNING //
    private static void welcomeMessage(){
        System.out.println("\t\t\tTAMAGOTCHI\n" + longLine + longLine);
        System.out.println("Greetings friend. What pet would you \nlike?\n" +
                longLine + longLine +
                "\n1.\tDog" +
                "\n2.\tCat" +
                "\n3.\tQuit");
    }

    private static void dogMenuOptions(){
        boolean continueLoop = true;
        String inputFromUser = "";
        do{
            inputFromUser = scan.nextLine();
            switch(inputFromUser){
                case "1":
                    userDog.play();
                    continueLoop = false;
                    dogMenu();
                    break;
                case "2":
                    userDog.feed();
                    break;
                case "3":
                    userDog.sleep();
                    break;
                case "4":
                    userDog.makeSound();
                    break;
                case "5":
                    return;
                default:
                    System.out.println("That's not an option!");
            }

        }while(continueLoop);
    }

    private static void catMenuOptions(){

    }

    private static void mainMenu(){
        boolean continueLoop = true;
        String userChoice = "";
        welcomeMessage();
        do{
        userChoice = scan.nextLine();
            System.out.println(longLine + longLine);
            switch(userChoice){
                case "1":
                    dogMenu();
                    continueLoop = false;
                    break;
                case "2":
                    catMenu();
                    continueLoop = false;
                    break;
                case "3":
                    System.out.println("Aw, what a shame. See you around!");
                    continueLoop = false;
                    break;
                default:
                    System.out.println("Invalid Input.");
            }

        }while(continueLoop);
    }


    private static void catMenu(){
        System.out.println("You've chosen a cat as your Tamagotchi. What would you like" +
                "\nto name your new little friend?");
        nameOfTamagotchi = scan.nextLine();
        Cat userCat = new Cat(nameOfTamagotchi, randomValue(), randomValue(), randomValue(), randomValue());
    }

    private static void dogMenu(){
        String inputFromUser = "";
        boolean continueLoop = true;
        System.out.println("You've chosen a dog as your Tamagotchi. " +
                "\nWhat would you like" +
                "\nto name your new little friend?");
        nameOfTamagotchi = scan.nextLine();
        Dog userDog = new Dog(nameOfTamagotchi, randomValue(),randomValue(),randomValue(), randomValue());
        System.out.println(nameOfTamagotchi + " what a great name!" +
                " What would you like" +
                "\n to do?\n" +
                longLine + longLine +
                "\n1.\tPlay" +
                "\n2.\tFeed" +
                "\n3.\tSleep" +
                "\n4.\tBark" +
                "\n5.\tQuit");
        do{
        inputFromUser = scan.nextLine();
            switch(inputFromUser){
                case "1":
                    userDog.play();
                    continueLoop = false;
                    dogMenu();
                    break;
                case "2":
                    userDog.feed();
                    break;
                case "3":
                    userDog.sleep();
                    break;
                case "4":
                    userDog.makeSound();
                    break;
                case "5":
                    return;
                default:
                    System.out.println("That's not an option!");
            }

        }while(continueLoop);
    }

    private static int randomValue(){
        int max = 10;
        int min = 3;
        int range = max - min + 1;
        int randomNumber = (int)(Math.random()*range) + min;

        return randomNumber;
    }


            // MAIN //
    public static void main(String[] args) {
        mainMenu();



    }
}
