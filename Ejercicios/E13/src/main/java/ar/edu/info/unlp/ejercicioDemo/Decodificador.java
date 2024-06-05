package ar.edu.info.unlp.ejercicioDemo;

import java.util.ArrayList;
import java.util.List;

public class Decodificador {
    private List<Pelicula> historial = new ArrayList<Pelicula>();
    private CriterioSugerenciaStrategy criterioSugerencia;

    static private List<Pelicula> grillaPeliculas;

    public Decodificador (List<Pelicula> grilla) {
        grillaPeliculas = grilla;
    }

    public List<Pelicula> grilla () {
        return grillaPeliculas;
    }

    public List<Pelicula> historial () {
        return this.historial;
    }

    public void verPelicula (Pelicula pelicula) {
        this.historial.add(pelicula);
    }

    public void cambiarCriterio (CriterioSugerenciaStrategy criterio) {
        this.criterioSugerencia = criterio;
    }

    public List<Pelicula> sugerirPeliculas () {
        return criterioSugerencia.sugerirPeliculas(this);
    }

}
