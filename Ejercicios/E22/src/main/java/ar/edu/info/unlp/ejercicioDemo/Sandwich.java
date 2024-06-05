package ar.edu.info.unlp.ejercicioDemo;

import java.util.ArrayList;

public class Sandwich {
    
    private ArrayList<Ingrediente> ingredientes;

    public Sandwich(ArrayList<Ingrediente> ingredientes) {
        this.ingredientes = ingredientes;
    }

    public double costo() {
        return this.ingredientes.stream()
            .mapToDouble(I -> I.costo())
            .sum();
    }

}
