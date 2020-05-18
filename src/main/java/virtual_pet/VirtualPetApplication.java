package virtual_pet;

import java.util.Scanner;

public class VirtualPetApplication {
     static Scanner scanner = new Scanner(System.in);
    static VirtualPet virtualPet = new VirtualPet();

    public static void main(String[] args) {
        gameLoop (scanner);

    }
    public static void gameLoop(Scanner scanner){
        while(virtualPet.getHunger() > 0 && virtualPet.getThirst() > 0) {
            giveUserOptions(scanner);
        }
        gameOver();


    }
    public static void gameOver() {
        int hunger = virtualPet.getHunger();
        int thirst = virtualPet.getThirst();
        int happiness = virtualPet.getHappiness();
        int energy = virtualPet.getEnergy();


        if(happiness >= 20) {
            System.out.println("You have made Martin very happy! You win!");
        } else if (hunger >= 20) {
            System.out.println("Martin was hungry and ran away. You lose!");
        } else if (thirst >=20) {
            System.out.println("Martin was thirsty and ran away. You lose!");
        }
    }
    public static void giveUserOptions (Scanner scanner)  {
        System.out.println("What do you want to do?");
        System.out.println("1. Feed Martin");
        System.out.println("2. Water Martin");
        System.out.println("3. Play with Martin");
        System.out.println("4. Put Martin to bed");
        System.out.println("5. Do Nothing");
        int userResponse = scanner.nextInt();

        switch (userResponse) {
            case 1:
                virtualPet.feedCat();
                break;
            case 2:
                virtualPet.waterCat();
                break;
            case 3:
                virtualPet.playWithCat();
                break;
            case 4:
                virtualPet.putCatToBed();
                break;
            default:
                virtualPet.doNothing();
        }
        virtualPet.tick();
        revealAttributes();


    }
    public static void revealAttributes() {
        int hunger = virtualPet.getHunger();
        int thirst = virtualPet.getThirst();
        int happiness = virtualPet.getHappiness();
        int energy = virtualPet.getEnergy();

        System.out.println("Hunger is " + hunger);
        System.out.println("Thirst is " + thirst);
        System.out.println("Happiness is " + happiness);
        System.out.println("Energy is " + energy);
        System.out.println("");
    }


}

