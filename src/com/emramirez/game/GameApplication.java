package com.emramirez.game;

import com.emramirez.game.model.HandWeapon;
import com.emramirez.game.model.Wizard;
import com.emramirez.game.model.Character;

public class GameApplication {

    public static void main(String... args) {
        Character character = new Wizard();
        character.fight();
        character.setWeaponBehavior(new HandWeapon());
        character.fight();
    }
}
