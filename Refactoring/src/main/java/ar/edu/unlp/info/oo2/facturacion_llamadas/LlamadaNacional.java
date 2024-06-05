package ar.edu.unlp.info.oo2.facturacion_llamadas;

public class LlamadaNacional extends Llamada{
    
    static double precioPorSegundo = 3;

    public LlamadaNacional(String origen, String destino, int duracion) {
        super(origen, destino, duracion);
    }

    private double precioDuracion() {
        return this.getDuracion() * precioPorSegundo;
    }

    public double costeLlamada() {
		return precioDuracion() + (precioDuracion() * IVA);
	}
}


