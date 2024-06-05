package ar.edu.unlp.info.oo2.facturacion_llamadas;

public class strategyUltimo extends generadorNumerosLibresStrategy {
    
    public String obtenerNumeroLibre(GestorNumerosDisponibles gestor) {
		String linea;
		linea = gestor.getLineas().last();
		gestor.getLineas().remove(linea);
		return linea;
	}

}

