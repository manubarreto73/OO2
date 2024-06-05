package ar.edu.unlp.info.oo2.facturacion_llamadas;

public class LlamadaInternacional extends Llamada {
    
    static double precioPorSegundo = 150;
    static double precioPorEstablecerLlamada = 50;

    public LlamadaInternacional(String origen, String destino, int duracion) {
        super(origen, destino, duracion);
    }

    private double precioDuracion() {
        return this.getDuracion() * precioPorSegundo;
    }

    public double costeLlamada() {
		return precioDuracion() + (precioDuracion() * IVA) + precioPorEstablecerLlamada;
	}
}

