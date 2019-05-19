package com.emramirez.game.model;

public class HandWeapon implements WeaponBehavior {

    @Override
    public void attack() {
        System.out.println("Ouch, attacking with bare hands!");
    }
}
