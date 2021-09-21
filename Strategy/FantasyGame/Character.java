package Strategy.FantasyGame;

import Strategy.FantasyGame.Strategies.WeaponBehavior;

public abstract class Character {

    WeaponBehavior weaponbehavior;

    public void setWeaponBehavior(WeaponBehavior weaponbehavior){
        this.weaponbehavior = weaponbehavior;
    }

    public void attack(){
        weaponbehavior.attack();
    }

}
