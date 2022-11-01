package adventuregame;

import java.util.Scanner;

public class Game {
    private Scanner sc = new Scanner(System.in);

    public void start() {
        System.out.println("WELCOME TO ADVENTURE GAME");
        System.out.println("Please enter a name: ");
        String playerName = sc.nextLine();
        Player player = new Player(playerName);
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
            System.out.println("3 - CAVE");
            System.out.println("4 - FOREST");
            System.out.println("5 - RIVER");
            System.out.println("0 - Exit");
            System.out.println("----------------------------");
            System.out.print("Select a region :");
            int selectLoc = sc.nextInt();

            switch (selectLoc) {
                case 0:
                    location = null;
                    break;
                case 1:
                    location = new SafeHouse(player);
                    break;
                case 2:
                    location = new ToolStore(player);
                    break;
                case 3:
                    location = new Cave(player);
                    break;
                case 4:
                    location = new Forest(player);
                    break;
                case 5:
                    location = new River(player);
                    break;
                default:
                    System.out.println("Enter a valid region!");
                    break;
            }

            if (location == null) {
                System.out.println("The game is shutting down ");
                break;
            }
            if (!location.onLocation()) {
                System.out.println("GAME OVER!");
                break;
            }
        }
    }
}
