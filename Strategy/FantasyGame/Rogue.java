package Strategy.FantasyGame;

import Strategy.FantasyGame.Strategies.BowAndArrow;

public class Rogue extends Character{

    public Rogue(){
        weaponbehavior = new BowAndArrow();
    }

}
