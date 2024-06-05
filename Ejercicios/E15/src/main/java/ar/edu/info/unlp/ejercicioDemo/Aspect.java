package ar.edu.info.unlp.ejercicioDemo;

import java.time.LocalDate;

public abstract class Aspect implements FileOO2 {
    
    protected FileOO2 component;

    public Aspect (FileOO2 component) {
        this.component = component;
    }

    public String getName() {
        return component.getName();
    }
    public double getExtension() {
        return component.getExtension();
    }
    public double getSize() {
        return component.getSize();
    }
    public LocalDate getCreationDate() {
        return component.getCreationDate();
    }
    public LocalDate getLastModifyDate() {
        return component.getLastModifyDate();
    }
    public String getPermisos() {
        return component.getPermisos();
    }

    public abstract String print ();

}
