package adventuregame;

public class Armor {
    private String name;
    private int ID;
    private int block;
    private int price;

    public Armor(int ID,String name, int block, int price) {
        this.name = name;
        this.ID = ID;
        this.block = block;
        this.price = price;
    }
    public static Armor[] armors() {
        Armor[] armorList = new Armor[3];
        armorList[0] = new Armor(1,"Iron Armor",1,15);
        armorList[1] = new Armor(2,"Silver Armor",3,25);
        armorList[2] = new Armor(3,"Gold Armor",5,48);

        return armorList;
    }

    public static Armor getArmorObjByID(int id) {
        for (Armor a : Armor.armors()) {
            if (a.getID() == id) {
                return a;
            }
        }

        return null;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getBlock() {
        return block;
    }

    public void setBlock(int block) {
        this.block = block;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
