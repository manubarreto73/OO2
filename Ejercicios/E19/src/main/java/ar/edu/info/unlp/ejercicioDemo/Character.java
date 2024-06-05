package ar.edu.info.unlp.ejercicioDemo;

import java.util.ArrayList;

public class Character {
    
    private Weapon weapon;
    private Armor armor;
    private ArrayList<Ability> abilities;

    public Character (Weapon weapon, Armor armor) {
        this.weapon = weapon;
        this.armor = armor;
        this.abilities = new ArrayList<Ability>();
    }

    public void addAbility(Ability ability) {
        this.abilities.add(ability);
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public Armor getArmor() {
        return armor;
    }

}