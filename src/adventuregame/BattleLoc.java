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
            //Fight
        }
        System.out.println("---------------------------------------------");

        return true;
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
