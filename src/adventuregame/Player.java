package adventuregame;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Player {
    private int damage;
    private int healthy;
    private int money;
    private String name;
    private String characterName;
    private Scanner sc = new Scanner(System.in);
    private Inventory inventory;

    public Player(String name) {

        this.name = name;
        this.inventory = new Inventory();
    }

    public void selectCharacter() {
        GameCharacter[] characterList = {new Samurai(), new Archer(), new Knight()};
        System.out.println("-------------------------------------------------------");
        for (GameCharacter gc : characterList) {
            System.out.println("ID: " + gc.getId() +
                    "\tCharacter: " + gc.getName() +
                    "\t Damage: " + gc.getDamage() +
                    "\t Health: " + gc.getHealth() +
                    "\t Money:  " + gc.getMoney());
            System.out.println("-------------------------------------------------------");
        }
        System.out.println();
        System.out.print("Which character did you choose:");
        int selectCharacter = sc.nextInt();

        switch (selectCharacter) {
            case 1:
                initCharacter(new Samurai());
                break;
            case 2:
                initCharacter(new Archer());
                break;
            case 3:
                initCharacter(new Knight());
                break;
            default:
                System.out.println("Please choose from the characters on the screen!");
                break;
        }
        System.out.println("You set out with " + this.getCharacterName() +
                "\tDamage:" + this.getDamage() +
                "\tHealth:" + this.getHealthy() +
                "\tMoney:" + this.getMoney());
    }

    public void initCharacter(GameCharacter gameCharacter) {
        this.setDamage(gameCharacter.getDamage());
        this.setHealthy(gameCharacter.getHealth());
        this.setMoney(gameCharacter.getMoney());
        this.setName(gameCharacter.getName());
    }

    public void printInfo() {
        System.out.println(
                "Gun : " + this.getInventory().getWeapon().getName() +
                        "\nArmor : " + this.getInventory().getArmor().getName() +
                        "\nBlock : " + this.getInventory().getArmor().getBlock() +
                        "\nDamage : " + this.getDamage() +
                        "\nHealth : " + this.getHealthy() +
                        "\nMoney : " + this.getMoney());
    }

    public int getDamage() {
        return this.damage + this.getInventory().getWeapon().getDamage();
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getHealthy() {
        return this.healthy;
    }

    public void setHealthy(int healthy) {
        this.healthy = healthy;
    }

    public int getMoney() {
        return this.money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public String getCharacterName() {
        return this.characterName;
    }

    public void setCharacterName(String characterName) {
        this.characterName = characterName;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }
}
