package Strategy.FantasyGame.Strategies;

public class GreatSword implements WeaponBehavior{

    @Override
    public void attack() {
        System.out.println("Strong attack in the enemy, break him into two pieces!");
    }
}
