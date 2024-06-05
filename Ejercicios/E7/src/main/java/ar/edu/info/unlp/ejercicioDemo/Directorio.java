package ar.edu.info.unlp.ejercicioDemo;

import java.util.ArrayList;
import java.util.Comparator;

public class Directorio extends Component{
    private ArrayList<Component> componentes;

    public Directorio (String name) {
        super(name);
        this.componentes = new ArrayList<Component>();
    }

    public ArrayList<Component> getChildren() {
        return this.componentes;
    }

    public void add(Component aux) {
        this.componentes.add(aux);
    }

    public void remove(String name) {
        Component aux = this.componentes.stream()
        .filter(componente -> componente.getName().equals(name))
        .findFirst().orElse(null);
        if (aux != null)
            this.componentes.remove(aux);
    }

    // Acá voy a suponer que el tamaño de los archivos o directorios se guarda siempre en KB
    public int size () {
        return 32 + this.componentes.stream()
            .mapToInt(componente -> componente.size())
            .sum();
    }

    public Archivo archivoMasGrande () {
        Component aux = this.componentes.stream()
        .max((a1, a2) -> Integer.compare(a1.archivoMasGrande().size(), a2.archivoMasGrande().size()))
        .orElse(null);
        return aux.archivoMasGrande();
    }

    public Archivo archivoMasNuevo () {
        Component aux = this.componentes.stream()
        .max(Comparator.comparing(Component::getFechaCreacion))
        .orElse(null);
        return aux.archivoMasNuevo();
    }

    /* 
    public Component buscar (String name) {
        Component aux = this.componentes.stream()
            .filter(component -> component.getName().equals(name))
            .findFirst()
            .orElse(null);
        if (aux != null) 
            return aux;
        else
            return this.componentes.stream()
                    .map(component -> component.buscar(name))
                    .filter(component -> component != null)
                    .findFirst()
                    .orElse(null);
    }
    */

    public Component buscar (String name) {
        if (this.getName().equals(name))
            return this;
        return this.componentes.stream()
                .map(component -> component.buscar(name))
                .filter(component -> component != null)
                .findFirst()
                .orElse(null);
    }

    public void buscarTodos(String name, ArrayList<Component> lista) {
        if (this.getName().equals(name)) 
            lista.add(this);
        for (Component component : this.componentes) {
            component.buscarTodos(name, lista);
        }
    }

    public void listadoDeContenido (String path, ArrayList<String> lista) {
        String myPath = path+"/"+this.getName();
        lista.add(myPath);
        for (Component component : this.componentes) {
            component.listadoDeContenido(myPath, lista);
        }
    }

}
