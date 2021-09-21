package Strategy.FantasyGame.Strategies;

public class BowAndArrow implements WeaponBehavior{
    @Override
    public void attack() {
        System.out.println("Shot a arrow in the head of the enemy!");
    }
}
