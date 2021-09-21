package Strategy.FantasyGame.Strategies;

public class Knife implements WeaponBehavior{
    @Override
    public void attack() {
        System.out.println("Cutting the enemy with a knife!");
    }
}
