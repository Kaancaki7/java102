package adventuregame;

public class SafeHouse extends NormalLocation{

    public SafeHouse(Player player) {
        super(player,"Safe House");
    }

    @Override
    public boolean onLocation() {
        System.out.println("Your are in the safe house!");
        System.out.println("Your life bar is full!");
        this.getPlayer().setHealthy(this.getPlayer().getOriginalHealthy());

        return true;
    }
}
