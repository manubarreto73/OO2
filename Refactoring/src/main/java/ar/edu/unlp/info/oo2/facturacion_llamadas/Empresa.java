package ar.edu.unlp.info.oo2.facturacion_llamadas;

import java.util.ArrayList;
import java.util.List;

public class Empresa {
	private List<Cliente> clientes = new ArrayList<Cliente>();
	private List<Llamada> llamadas = new ArrayList<Llamada>();
	private GestorNumerosDisponibles guia = new GestorNumerosDisponibles();

	public boolean agregarNumeroTelefono(String str) {
		return guia.agregarNumeroTelefono(str);
	}

	public String obtenerNumeroLibre() {
		return guia.obtenerNumeroLibre();
	}

	public Cliente registrarUsuario(Cliente cliente) {
		cliente.setNumeroTelefono(guia.obtenerNumeroLibre());
		clientes.add(cliente);
		return cliente;
	}

	public Llamada registrarLlamada(Cliente origen, Llamada llamada) {
		llamadas.add(llamada);
		origen.addLlamada(llamada);
		return llamada;
	}

	public double calcularMontoTotalLlamadas(Cliente cliente) {
		return cliente.calcularMontoTotalLlamadas();
	}

	public int cantidadDeUsuarios() {
		return clientes.size();
	}

	public boolean existeUsuario(Cliente persona) {
		return clientes.contains(persona);
	}

	public GestorNumerosDisponibles getGestorNumeros() {
		return this.guia;
	}
}
