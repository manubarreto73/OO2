package ar.edu.info.unlp.ejercicioDemo;

public class Wizard extends Character {
    
    public Wizard () {
        super(new Weapon("Wand"), new Armor("Leather"));
        super.addAbility(new Ability("Magic"));
        super.addAbility(new Ability("Distance combat"));
    }

}