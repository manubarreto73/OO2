package ar.edu.info.unlp.ejercicioDemo;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SugerirPorPuntaje implements CriterioSugerenciaStrategy {
    
    public List<Pelicula> sugerirPeliculas(Decodificador decodificador) {
        return decodificador.grilla().stream()
            .sorted(Comparator.comparingDouble(Pelicula::getPuntaje).thenComparing(Pelicula::getReleaseYear).reversed())
            .filter(p -> !decodificador.historial().contains(p))
            .limit(3)
            .collect(Collectors.toList());
    }

}
