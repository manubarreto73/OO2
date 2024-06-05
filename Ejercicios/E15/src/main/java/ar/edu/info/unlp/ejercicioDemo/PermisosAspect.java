package ar.edu.info.unlp.ejercicioDemo;

public class PermisosAspect extends Aspect {
    
    public PermisosAspect (FileOO2 component) {
        super(component);
    }

    public String print () {
        return this.component.print() + this.getPermisos();
    }

}