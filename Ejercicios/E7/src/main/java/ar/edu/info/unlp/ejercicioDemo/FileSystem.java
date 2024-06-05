package ar.edu.info.unlp.ejercicioDemo;

import java.util.ArrayList;

public class FileSystem {
    private Directorio raiz;

    public FileSystem () {
        raiz = new Directorio("/");
    }

    public Directorio getRaiz() {
        return this.raiz;
    }

    public int tamanoTotalOcupado() {
        return this.raiz.size();
    }

    public Archivo archivoMasGrande() {
        return raiz.archivoMasGrande();
    }

    public Archivo archivoMasNuevo() {
        return raiz.archivoMasNuevo();
    }

    public Component buscar (String nombre) {
        return this.raiz.buscar(nombre);
    }

    //Quizas podria resolver el metodo anterior solo llamando a este metodo y devolviendo el primero de la lista
    public ArrayList<Component> buscarTodos (String nombre) {
        ArrayList<Component> lista = new ArrayList<Component>();
        this.raiz.buscarTodos(nombre, lista);
        return lista;
    }

    public String listadoDeContenido() {
        ArrayList<String> lista = new ArrayList<String>();
        this.raiz.listadoDeContenido("/", lista);
        String contenido = "/";
        for (String string : lista) {
            contenido+=(string+"\n");
        }
        return contenido;
    }
}
