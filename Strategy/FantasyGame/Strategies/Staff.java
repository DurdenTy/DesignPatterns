package Strategy.FantasyGame.Strategies;

public class Staff implements WeaponBehavior{

    @Override
    public void attack() {
        System.out.println("Using a staff blow attack on the head of the enemy!");
    }
}
