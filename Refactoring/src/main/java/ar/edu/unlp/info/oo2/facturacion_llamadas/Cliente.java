package ar.edu.unlp.info.oo2.facturacion_llamadas;

import java.util.ArrayList;
import java.util.List;

public abstract class Cliente {
	private List<Llamada> llamadas = new ArrayList<Llamada>();
	private String nombre;
	private String numeroTelefono;

	public Cliente (String nombre) {
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}
	public String getNumeroTelefono() {
		return numeroTelefono;
	}
	public void setNumeroTelefono(String numeroTelefono) {
		this.numeroTelefono = numeroTelefono;
	}

	public List<Llamada> getLlamadas() {
		return new ArrayList<Llamada>(this.llamadas);
	}
	public void addLlamada (Llamada llamada) {
		this.llamadas.add(llamada);
	}
	public void removeLlamda (Llamada llamada) {
		this.llamadas.remove(llamada);
	}

	public double calcularMontoTotalLlamadas() {
		return this.llamadas.stream().mapToDouble(llamada -> aplicarDescuento(llamada.costeLlamada())).sum();
	}

	public abstract double aplicarDescuento(double aux);
}
