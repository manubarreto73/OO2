package ar.edu.info.unlp.ejercicioDemo;

public class SizeAspect extends Aspect {
    
    public SizeAspect (FileOO2 component) {
        super(component);
    }

    public String print () {
        return this.component.print() + this.getSize();
    }

}