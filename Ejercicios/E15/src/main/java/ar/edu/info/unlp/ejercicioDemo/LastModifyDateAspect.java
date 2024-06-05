package ar.edu.info.unlp.ejercicioDemo;

public class LastModifyDateAspect extends Aspect {
    
    public LastModifyDateAspect (FileOO2 component) {
        super(component);
    }

    public String print () {
        return this.component.print() + this.getLastModifyDate();
    }

}