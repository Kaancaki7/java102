package adventuregame;

import java.util.Random;

public abstract class BattleLoc extends Location{
    private Monster monster;
    private String award;
    private int maxMonster;

    public BattleLoc(Player player, String name,Monster monster,String award,int maxMonster) {
        super(player, name);
        this.monster = monster;
        this.award = award;
        this.maxMonster = maxMonster;
    }

    @Override
    public boolean onLocation() {
        int obsNumber = this.randomMonsterNumber();
        System.out.println();
        System.out.println("you are here now " + this.getName());
        System.out.println("Be careful! " + obsNumber + " " + this.getMonster().getName() + " lives here");
        System.out.println();
        System.out.println("---------------------------------------------");
        System.out.println("!!!Fight or Flight!!!\nFight - press x/X\nFlight - press z/Z");
        String selectBattleCase = sc.nextLine();
        selectBattleCase = selectBattleCase.toUpperCase();


        if (selectBattleCase.equals("X")) {
            System.out.println("tough decisions come from brave hearts!");
            if (combat(obsNumber)) {
                System.out.println(this.getName() + " you defeated all the enemies!");
                return true;
            }
        }
        System.out.println("---------------------------------------------");

        if (this.getPlayer().getHealthy() <= 0) {
            System.out.println("You died...");
            return false;
        }

        return true;
    }

    public boolean combat(int monsterNumber) {

        for (int i = 0; i < monsterNumber; i++) {
            this.getMonster().setHealth(this.getMonster().getOriginalHealth());
            playerStats();
            monsterStats();
            while (this.getPlayer().getHealthy() > 0 && this.getMonster().getHealth() > 0) {
                System.out.print("Attack or Back off!\nPress 'a' to attack.\nPress 'b' to back off\nChoise:");
                String selectCombat = sc.nextLine().toUpperCase();
                if (selectCombat.equals("A")) {
                    System.out.println("You attacked!");
                    this.getMonster().setHealth(this.monster.getHealth() - this.getPlayer().getTotalDamage());
                    afterHit();
                    if (this.getMonster().getHealth() > 0) {
                        System.out.println();
                        System.out.println(this.getMonster().getName() + " attacked you!");
                        int monsterDmg = this.getMonster().getDamage() - this.getPlayer().getInventory().getArmor().getBlock();
                        if (monsterDmg < 0) {
                            monsterDmg = 0;
                        }
                        this.getPlayer().setHealthy(this.getPlayer().getHealthy() - monsterDmg);
                        afterHit();
                    }
                }
                else {
                    return false;
                }
            }
            if (this.getMonster().getHealth() < this.getPlayer().getHealthy()) {
                System.out.println("You win !");
                System.out.println(this.getMonster().getAward() + " won!");
                this.getPlayer().setMoney(this.getPlayer().getMoney() + this.getMonster().getAward());
                System.out.println("Current money : " + this.getPlayer().getMoney());
            }
            else {
                return false;
            }
        }
        return true;
    }

    public void afterHit() {
        System.out.println("your health : " + this.getPlayer().getHealthy());
        System.out.println("monster health : " + this.getMonster().getHealth());
        System.out.println();
    }

    public void monsterStats() {
        System.out.println(this.getMonster().getName() + " properties : ");
        System.out.println("-----------------------------------");
        System.out.println("Health : " + this.getMonster().getHealth());
        System.out.println("Damage : " + this.getMonster().getDamage());
        System.out.println("Award : " + this.getMonster().getAward());
        System.out.println();

    }

    public void playerStats() {
        System.out.println("Player Information : ");
        System.out.println("-----------------------------------");
        System.out.println("Health : " + this.getPlayer().getHealthy());
        System.out.println("Damage : " + this.getPlayer().getTotalDamage());
        System.out.println("Money : " + this.getPlayer().getMoney());
        System.out.println("Gun : "  + this.getPlayer().getInventory().getWeapon().getName());
        System.out.println("Armor : " + this.getPlayer().getInventory().getArmor().getName());
        System.out.println("Block : " + this.getPlayer().getInventory().getArmor().getBlock());
        System.out.println();

    }

    public int randomMonsterNumber() {
        Random r = new Random();
        //1 ile 3 arasında canavar göndermek icin rasgele.
        return r.nextInt(this.getMaxMonster()) + 1;
    }

    public Monster getMonster() {
        return monster;
    }

    public void setMonster(Monster monster) {
        this.monster = monster;
    }

    public String getAward() {
        return award;
    }

    public void setAward(String award) {
        this.award = award;
    }

    public int getMaxMonster() {
        return maxMonster;
    }

    public void setMaxMonster(int maxMonster) {
        this.maxMonster = maxMonster;
    }
}
