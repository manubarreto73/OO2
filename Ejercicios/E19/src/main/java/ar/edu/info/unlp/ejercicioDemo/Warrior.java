package ar.edu.info.unlp.ejercicioDemo;

public class Warrior extends Character {
    
    public Warrior () {
        super(new Weapon("Sword"), new Armor("Steel"));
        super.addAbility(new Ability("Close Combat"));
    }

}
