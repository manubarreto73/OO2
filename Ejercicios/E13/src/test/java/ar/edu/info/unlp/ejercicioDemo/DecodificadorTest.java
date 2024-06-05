package ar.edu.info.unlp.ejercicioDemo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DecodificadorTest {
	
	Decodificador decodificador;
	
	@BeforeEach
	void setUp() throws Exception {
		Pelicula p1 = new Pelicula("Thor", 2007, 7.9);
        Pelicula p2 = new Pelicula("Capitan America", 2016, 7.8);
        Pelicula p3 = new Pelicula("Iron man", 2010, 7.9);
        Pelicula p4 = new Pelicula("Dunkirk", 2017, 7.9);
        Pelicula p5 = new Pelicula("Rocky", 1976, 8.1);
        Pelicula p6 = new Pelicula("Rambo", 1979, 7.8);
        p1.addSimilar(p2);
        p1.addSimilar(p3);
        p2.addSimilar(p3);
        p5.addSimilar(p6);
        List<Pelicula> grilla = List.of(p1, p2, p3, p4, p5, p6);
        decodificador = new Decodificador(grilla);
        decodificador.verPelicula(p1);
        decodificador.verPelicula(p5);
	}
    
    @Test
    public void testNovedades() {
        System.out.println("Por novedades:");
        decodificador.cambiarCriterio(new SugerirNovedades());
        List<Pelicula> recomendaciones = decodificador.sugerirPeliculas();
        assertEquals(3, recomendaciones.size());
        for (Pelicula pelicula : recomendaciones) {
            System.out.println(pelicula.getTitulo());
        }
    }

    @Test
    public void testSimilares() {
        System.out.println("Por similares:");
        decodificador.cambiarCriterio(new SugerirSimilares());
        List<Pelicula> recomendaciones = decodificador.sugerirPeliculas();
        assertEquals(3, recomendaciones.size());
        for (Pelicula pelicula : recomendaciones) {
            System.out.println(pelicula.getTitulo());
        }
    }

    @Test
    public void testPorPuntaje() {
        System.out.println("Por puntaje:");
        decodificador.cambiarCriterio(new SugerirPorPuntaje());
        List<Pelicula> recomendaciones = decodificador.sugerirPeliculas();
        assertEquals(3, recomendaciones.size());
        for (Pelicula pelicula : recomendaciones) {
            System.out.println(pelicula.getTitulo());
        }
    }

}
