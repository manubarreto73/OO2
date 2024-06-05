package ar.edu.info.unlp.ejercicioDemo;

public class ExtensionAspect extends Aspect {
    
    public ExtensionAspect (FileOO2 component) {
        super(component);
    }

    public String print () {
        return this.component.print() + this.getExtension();
    }

}