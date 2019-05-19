package com.emramirez.game.model;

public abstract class Character {

    // Applying strategy pattern, encapsulating changing behavior and making it interchangeable at runtime
    // Programming to an interface
    protected WeaponBehavior weaponBehavior;

    public abstract void fight();

    public WeaponBehavior getWeaponBehavior() {
        return weaponBehavior;
    }

    public void setWeaponBehavior(WeaponBehavior weaponBehavior) {
        this.weaponBehavior = weaponBehavior;
    }
}
