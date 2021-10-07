import java.util.Scanner;

    // Laver ny "main" for at slippe for static
class GameStart {

    private final Scanner scan = new Scanner(System.in);
    private final String longLine = "-------------------";
    private Tamagotchi tamagotchi = null;


            // GAME RUNNING //
    private void welcomeMessage() {
        System.out.println("\t\t\tTAMAGOTCHI\n" + longLine + longLine);
        System.out.println("Greetings friend. What pet would you \nlike?\n" +
                longLine + longLine +
                "\n1.\tDog" +
                "\n2.\tCat" +
                "\n3.\tQuit");
    }
    // Second menu for the chosen tamagotchi
    private void tamagotchiMenuOptions(){
        String inputFromUser = "";
        // do/while to make menu
        do{
            System.out.println("\t\t_STATS_");
            tamagotchi.printAllStats();
                // Checking if tamagotchi stats are too low and killing if too low.
            if (tamagotchi.isTamagotchiDeadYet())
            {
                System.out.println(longLine);
                System.out.println("  _____\n" +
                        " /     \\\n" +
                        "| () () |\n" +
                        " \\  ^  /\n" +
                        "  |||||\n" +
                        "  |||||");
                System.out.println("YOU KILLED YOUR TAMAGOTCHI.");
                System.out.println("GAME OVER.");
                System.out.println(longLine);
                break;
            }

            printMenuMessage();
            inputFromUser = scan.nextLine();
            switch(inputFromUser){
                case "1":
                    tamagotchi.play();
                    break;
                case "2":
                    tamagotchi.feed();
                    break;
                case "3":
                    tamagotchi.sleep();
                    break;
                case "4":
                    tamagotchi.makeSound();
                    break;
                case "5":
                    return;
                default:
                    System.out.println("That's not an option!");
            }

        }while(true);
    }

    //First menu to check which animal user chooses
    private void mainMenu(){
        boolean continueLoop = true;
        String userChoice = "";
        welcomeMessage();
        do{
            userChoice = scan.nextLine();
            System.out.println(longLine + longLine);
            switch(userChoice){
                case "1":
                    tamagotchi = new Dog("NoName", randomValue(), randomValue(), randomValue(), randomValue());
                    assignTamagotchiName(tamagotchi);
                    tamagotchiMenuOptions();
                    continueLoop = false;
                    break;
                case "2":
                    tamagotchi = new Cat("",randomValue(),randomValue(),randomValue(),randomValue());
                    assignTamagotchiName(tamagotchi);
                    tamagotchiMenuOptions();
                    continueLoop = false;
                    break;
                case "3":
                    System.out.println("Aw, what a shame. See you around!");
                    continueLoop = false;
                    break;
                default:
                    System.out.println("Invalid Input.");
            }

        } while(continueLoop);
    }


    private void printMenuMessage(){
        System.out.println(
                " What would you like" +
                        "\n to do?\n" +
                        longLine + longLine +
                        "\n1.\tPlay" +
                        "\n2.\tFeed" +
                        "\n3.\tSleep" +
                        "\n4.\tMake sound" +
                        "\n5.\tQuit");
    }

    private int randomValue(){
        int max = 10;
        int min = 3;
        int range = max - min + 1;
        int randomNumber = (int)(Math.random()*range) + min;

        return randomNumber;
    }

    private void assignTamagotchiName(Tamagotchi tamagotchi)
    {
        System.out.println("What do you wanna call your Tamagotchi?");

        tamagotchi.name = scan.nextLine();
        System.out.println(tamagotchi.name + ".. Great name!");
    }

    public void startGame()
    {
        mainMenu();
    }
}

public class Game {
    // MAIN //
    public static void main(String[] args) {
        new GameStart().startGame();
    }
}