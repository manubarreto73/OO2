package ar.edu.info.unlp.ejercicioDemo;

public class CreationDateAspect extends Aspect {
    
    public CreationDateAspect (FileOO2 component) {
        super(component);
    }

    public String print () {
        return this.component.print() + this.getCreationDate();
    }

}