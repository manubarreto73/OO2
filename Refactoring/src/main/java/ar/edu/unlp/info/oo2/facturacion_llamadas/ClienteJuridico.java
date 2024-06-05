package ar.edu.unlp.info.oo2.facturacion_llamadas;

public class ClienteJuridico extends Cliente {
    
    private String cuit;
    static protected double descuentoJur = 0.15;

    public ClienteJuridico(String nombre, String cuit) {
        super(nombre);
        this.cuit = cuit;
    }

    public String getCuit() {
		return cuit;
	}

    public double aplicarDescuento(double aux) {
        return aux - aux*descuentoJur;
    }

}