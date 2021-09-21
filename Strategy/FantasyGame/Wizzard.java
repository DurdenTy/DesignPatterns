package Strategy.FantasyGame;

import Strategy.FantasyGame.Strategies.MagicStaff;

public class Wizzard extends Character{

    public Wizzard(){
        weaponbehavior = new MagicStaff();
    }

}
