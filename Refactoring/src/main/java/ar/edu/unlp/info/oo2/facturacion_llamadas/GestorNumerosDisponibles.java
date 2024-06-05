package ar.edu.unlp.info.oo2.facturacion_llamadas;

import java.util.TreeSet;
import java.util.SortedSet;

public class GestorNumerosDisponibles {
	private SortedSet<String> lineas = new TreeSet<String>();
	private generadorNumerosLibresStrategy generadorStrategy;

	public GestorNumerosDisponibles () {
		generadorStrategy = new strategyUltimo();
	}

	public SortedSet<String> getLineas() {
		return lineas;
	}

	public String obtenerNumeroLibre() {
		return generadorStrategy.obtenerNumeroLibre(this);
	}

	public void setGeneradorStrategy(generadorNumerosLibresStrategy generadorStrategy) {
		this.generadorStrategy = generadorStrategy;
	}

	public boolean agregarNumeroTelefono(String str) {
		if (!this.getLineas().contains(str)) {
			this.getLineas().add(str);
			return true;
		}
		else {
			return false;
		}
	}
}
