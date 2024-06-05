package ar.edu.info.unlp.ejercicioDemo;

import java.util.List;

public interface CriterioSugerenciaStrategy {
    
    public List<Pelicula> sugerirPeliculas(Decodificador decodificador);

}
