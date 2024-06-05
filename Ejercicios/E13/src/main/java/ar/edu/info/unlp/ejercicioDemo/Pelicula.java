package ar.edu.info.unlp.ejercicioDemo;

import java.util.ArrayList;
import java.util.List;

public class Pelicula {
    private String titulo;
    private int releaseYear;
    private List<Pelicula> peliculasSimilares;
    private double puntaje;
    
    public Pelicula(String titulo, int releaseYear, double puntaje) {
        this.titulo = titulo;
        this.releaseYear = releaseYear;
        this.peliculasSimilares = new ArrayList<Pelicula>();
        this.puntaje = puntaje;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public List<Pelicula> getPeliculasSimilares() {
        return peliculasSimilares;
    }

    public double getPuntaje() {
        return puntaje;
    }

    public void addSimilar(Pelicula pelicula) {
        if (!this.peliculasSimilares.contains(pelicula)) {
            this.peliculasSimilares.add(pelicula);
            pelicula.addSimilar(this);
        }
    }
}
