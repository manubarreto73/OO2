package ar.edu.info.unlp.ejercicioDemo;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SugerirSimilares implements CriterioSugerenciaStrategy {
    
    public List<Pelicula> sugerirPeliculas(Decodificador decodificador) {
        return decodificador.historial().stream()
            .flatMap(p -> p.getPeliculasSimilares().stream())
            .distinct()
            .sorted(Comparator.comparingInt(Pelicula::getReleaseYear).reversed())
            .filter(p -> !decodificador.historial().contains(p))
            .limit(3)
            .collect(Collectors.toList());
    }

}
