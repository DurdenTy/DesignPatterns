package Strategy.FantasyGame;

import Strategy.FantasyGame.Strategies.Knife;

public class Assassin extends Character{

    public Assassin(){
        weaponbehavior = new Knife();
    }

}
