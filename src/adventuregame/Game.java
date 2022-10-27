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
    }
}
