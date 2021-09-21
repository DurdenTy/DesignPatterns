package Strategy.FantasyGame;

import Strategy.FantasyGame.Strategies.Staff;

public class Chanter extends Warrior{

    public Chanter(){
        weaponbehavior = new Staff();
    }

}
