package ar.edu.info.unlp.ejercicioDemo;

import java.util.ArrayList;

public abstract class Builder {
    
    protected ArrayList<Ingrediente> ingredientes = new ArrayList<Ingrediente>();

    public abstract Builder pan();
    public abstract Builder principal();
    public abstract Sandwich build();

}