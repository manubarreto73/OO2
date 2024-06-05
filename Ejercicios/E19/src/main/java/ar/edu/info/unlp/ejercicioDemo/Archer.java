package ar.edu.info.unlp.ejercicioDemo;

public class Archer extends Character {
    
    public Archer () {
        super(new Weapon("Bow"), new Armor("Leather"));
        super.addAbility(new Ability("Distance combat"));
    }

}
