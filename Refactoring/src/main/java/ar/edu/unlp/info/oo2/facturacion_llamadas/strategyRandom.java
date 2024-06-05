package ar.edu.unlp.info.oo2.facturacion_llamadas;

import java.util.ArrayList;
import java.util.Random;

public class strategyRandom extends generadorNumerosLibresStrategy {
    
    public String obtenerNumeroLibre(GestorNumerosDisponibles gestor) {
		String linea;
		linea = new ArrayList<String>(gestor.getLineas()).get(new Random().nextInt(gestor.getLineas().size()));
        gestor.getLineas().remove(linea);
		return linea;
    }

}


