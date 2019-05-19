package com.emramirez.game.model;

public abstract class Character {

    protected WeaponBehavior weaponBehavior;

    public abstract void fight();

    public WeaponBehavior getWeaponBehavior() {
        return weaponBehavior;
    }

    public void setWeaponBehavior(WeaponBehavior weaponBehavior) {
        this.weaponBehavior = weaponBehavior;
    }
}
