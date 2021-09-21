package Strategy.FantasyGame.Strategies;

public class MagicStaff implements WeaponBehavior{

    @Override
    public void attack() {
        System.out.println("Using Magic in the enemies!");
    }
}
