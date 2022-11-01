package adventuregame;

public class Monster {
    private int ID;
    private int damage;
    private int health;
    private String name;
    private int award;
    private int originalHealth;

    public Monster(int ID,String name,int damage,int health,int award) {
        this.name = name;
        this.ID = ID;
        this.damage = damage;
        this.health = health;
        this.award = award;
        this.originalHealth = health;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        if (health < 0) {
            health = 0;
        }
        this.health = health;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAward() {
        return award;
    }

    public void setAward(int award) {
        this.award = award;
    }

    public int getOriginalHealth() {
        return originalHealth;
    }

    public void setOriginalHealth(int originalHealth) {
        this.originalHealth = originalHealth;
    }
}
