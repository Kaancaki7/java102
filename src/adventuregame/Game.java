package adventuregame;

import java.util.Scanner;

public class Game {
    private Scanner sc = new Scanner(System.in);

    public void start() {
        System.out.println("WELCOME TO ADVENTURE GAME");
        System.out.println("Please enter a name: ");
        //String playerName = sc.nextLine();
        Player player = new Player("Kaan");
        System.out.println("Welcome to the game " + player.getName() + "! We were waiting for you :)");
        System.out.println("footnote : Try not the die!");
        System.out.println();
        System.out.println("Choose your character!");
        player.selectCharacter();

        System.out.println();
        Location location = null;
        while (true) {
            player.printInfo();
            System.out.println();
            System.out.println(">>>>>>>>REGION<<<<<<<<");
            System.out.println("----------------------------");
            System.out.println("1 - Safe House");
            System.out.println("2 - Tool Store");
            System.out.println("----------------------------");
            System.out.print("Select a region :");
            int selectLoc = sc.nextInt();

            switch (selectLoc) {
                case 1:
                    location = new SafeHouse(player);
                    break;
                case 2:
                    location = new ToolStore(player);
                    break;
                default:
                    location = new SafeHouse(player);
                    break;
            }

            if (!location.onLocation()) {
                System.out.println("GAME OVER!");
                break;
            }
        }
    }
}
