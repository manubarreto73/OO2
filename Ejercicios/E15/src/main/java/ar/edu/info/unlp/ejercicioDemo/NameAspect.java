package ar.edu.info.unlp.ejercicioDemo;

public class NameAspect extends Aspect {
    
    public NameAspect (FileOO2 component) {
        super(component);
    }

    public String print () {
        return this.component.print() + this.getName();
    }

}