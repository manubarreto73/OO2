package ar.edu.unlp.info.oo2.facturacion_llamadas;

public class strategyPrimero extends generadorNumerosLibresStrategy {
    
    public String obtenerNumeroLibre(GestorNumerosDisponibles gestor) {
		String linea;
		linea = gestor.getLineas().first();
		gestor.getLineas().remove(linea);
		return linea;
	}

}
