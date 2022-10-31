package adventuregame;

import javax.crypto.spec.PSource;
import java.sql.SQLOutput;

public class ToolStore extends NormalLocation{

    public ToolStore(Player player) {
        super(player,"Store");
    }

    @Override
    public boolean onLocation() {
        System.out.println("Welcome to store!\nMENU:");
        boolean showMenu = true;
        while (showMenu) {
            System.out.println("--------------------------");
            System.out.println("1 - Weapon");
            System.out.println("2 - Armor");
            System.out.println("3 - Exit");
            System.out.println("--------------------------");
            System.out.print("What do you want?..");
            int select = sc.nextInt();

            while (select < 1 || select > 3) {
                System.out.print("invalid operation. Please reselect : ");
                select = sc.nextInt();
            }

            switch (select) {
                case 1:
                    printWeapon();
                    buyWeapon();
                    break;
                case 2:
                    printArmor();
                    buyArmor();
                    break;
                case 3:
                    System.out.println("You are leaving the store...");
                    showMenu = false;
                    break;
            }
        }

        return true;
    }

    public void printWeapon() {
        System.out.println("WEAPONS : ");
        System.out.println("------------------------------");
        for (Weapon w : Weapon.weapons()) {
            System.out.println(w.getID() +" - "+ w.getName() +" -> " + " Money:" + w.getPrice() + " Damage:" + w.getDamage());
        }
        System.out.println("------------------------------");
        System.out.println("0  -  EXIT");
        System.out.println();
    }

    public void buyWeapon() {
        System.out.print("Choose a weapon : ");
        int selectWeaponID = sc.nextInt();

        while (selectWeaponID < 0 || selectWeaponID > Weapon.weapons().length) {
            System.out.print("invalid operation. Please reselect : ");
            selectWeaponID = sc.nextInt();
        }

        if (selectWeaponID != 0){
            Weapon selectedWeapon = Weapon.getWeaponObjByID(selectWeaponID);

            if (selectedWeapon != null) {
                if (selectedWeapon.getPrice() > this.getPlayer().getMoney()) {
                    System.out.println("Not enough money!");
                }
                else {
                    System.out.println(selectedWeapon.getName() + " purchased!");
                    int balance = this.getPlayer().getMoney() - selectedWeapon.getPrice();
                    this.getPlayer().setMoney(balance);
                    System.out.println("Your remaining money : " + this.getPlayer().getMoney());
                    System.out.println("Your previous weapon: " + this.getPlayer().getInventory().getWeapon().getName());
                    this.getPlayer().getInventory().setWeapon(selectedWeapon);
                    System.out.println("Your current weapon: " + this.getPlayer().getInventory().getWeapon().getName());
                }
            }
        }
    }

    public void printArmor() {
        System.out.println("ARMORS : ");

        for (Armor a : Armor.armors()) {
            System.out.println("----------------------------------------------------");
            System.out.println(a.getID() + " - " + a.getName() + " -> " + " Zırh : " + a.getBlock() + " Price : " + a.getPrice());
        }
        System.out.println("----------------------------------------------------");
        System.out.println("0  -  EXIT");
        System.out.println();
    }

    public void buyArmor(){
        System.out.print("Choose a armor : ");
        int selectArmorID = sc.nextInt();

        while (selectArmorID < 0 || selectArmorID > Armor.armors().length) {
            System.out.print("invalid operation. Please reselect : ");
            selectArmorID = sc.nextInt();
        }

       if (selectArmorID != 0) {
           Armor armorSelected = Armor.getArmorObjByID(selectArmorID);

           if (armorSelected != null) {
               if (armorSelected.getPrice() > this.getPlayer().getMoney()) {
                   System.out.println("Not enough money!");
               }
               else {
                   System.out.println(armorSelected.getName() + " purchased!");
                   int balance = this.getPlayer().getMoney() - armorSelected.getPrice();
                   this.getPlayer().setMoney(balance);
                   this.getPlayer().getInventory().setArmor(armorSelected);
                   System.out.println("Your remaining money : " + this.getPlayer().getMoney());
                   System.out.println();
               }
           }
       }
       }
}
