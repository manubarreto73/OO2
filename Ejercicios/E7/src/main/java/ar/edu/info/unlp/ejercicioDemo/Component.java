package ar.edu.info.unlp.ejercicioDemo;

import java.time.LocalDate;
import java.util.ArrayList;

public abstract class Component {
    private String name;
    private LocalDate fechaCreacion;
    
    public Component (String name) {
        this.name = name;
        this.fechaCreacion = LocalDate.now();
    }

    //agregado solo para testing
    public void setDate (LocalDate date) {
        this.fechaCreacion = date;
    }

    public String getName() {
        return name;
    }

    public LocalDate getFechaCreacion() {
        return fechaCreacion;
    }

    public abstract int size();
    public abstract ArrayList<Component> getChildren();
    public abstract Archivo archivoMasGrande();
    public abstract Archivo archivoMasNuevo();
    public abstract Component buscar(String name);
    public abstract void buscarTodos(String name, ArrayList<Component> lista);
    public abstract void listadoDeContenido(String path, ArrayList<String> lista);
}
