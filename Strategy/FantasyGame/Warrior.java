package Strategy.FantasyGame;

import Strategy.FantasyGame.Character;
import Strategy.FantasyGame.Strategies.GreatSword;
import Strategy.FantasyGame.Strategies.Staff;

public class Warrior extends Character {

    public Warrior(){
        weaponbehavior = new GreatSword();
    }

}
