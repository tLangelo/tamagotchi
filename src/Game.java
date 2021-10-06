public class Game {

    public static void mainMenu(){
        boolean continuePlaying = true;
        String userChoice = "";
        do{
            switch(userChoice){
                case "1":
                    break;
                case "2":
                    break;
                case "3":
                    break;
                case "4":
                    break;
                default:
                    System.out.println("Invalid Input.");
            }

        }while(true);
    }

    public static Tamagotchi animalChooser(){
        Tamagotchi userPet = new Dog();

        return userPet;
    }

    public static void main(String[] args) {
        mainMenu();
    }
}
