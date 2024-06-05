package ar.edu.info.unlp.ejercicioDemo;

import java.util.ArrayList;

public class Archivo extends Component {
    public int size;

    public Archivo (String name, int size) {
        super(name);
        this.size = size;
    }

    public int size () {
        return this.size;
    }

    public Archivo archivoMasGrande () {
        return this;
    }

    public Archivo archivoMasNuevo () {
        return this;
    }

    public ArrayList<Component> getChildren () {
        return null;
    }

    public Component buscar (String name) {
        if (super.getName().equals(name))
            return this;
        return null;
    }

    public void buscarTodos (String name, ArrayList<Component> lista) {
        if (this.getName().equals(name))
            lista.add(this);
    }

    public void listadoDeContenido (String path, ArrayList<String> lista) {
        lista.add(path+"/"+this.getName());
    }

}
