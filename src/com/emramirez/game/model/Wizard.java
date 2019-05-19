package com.emramirez.game.model;

public class Wizard extends Character {

    public Wizard() {
        weaponBehavior = new StaffWeapon();
    }

    @Override
    public void fight() {
        weaponBehavior.attack();
    }
}
