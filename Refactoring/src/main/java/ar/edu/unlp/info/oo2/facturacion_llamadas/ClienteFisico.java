package ar.edu.unlp.info.oo2.facturacion_llamadas;

public class ClienteFisico extends Cliente {
    
    private String dni;
    static protected double descuentoFis = 0;

    public ClienteFisico(String nombre, String dni) {
        super(nombre);
        this.dni = dni;
    }

    public String getDNI() {
        return dni;
    }

    public double aplicarDescuento(double aux) {
        return aux - aux*descuentoFis;
    }

}
