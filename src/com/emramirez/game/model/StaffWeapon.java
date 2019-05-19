package com.emramirez.game.model;

public class StaffWeapon implements WeaponBehavior {

    @Override
    public void attack() {
        System.out.println("Shooting firebolts with staff!!");
    }
}
