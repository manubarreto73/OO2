package ar.edu.info.unlp.ejercicioDemo;

import java.time.LocalDate;

public class CompraPesos extends ProductoFinanciero {
    
    private double valorCompra;

    public CompraPesos(LocalDate fecha, double valorCompra) {
        super(fecha);
        this.valorCompra = valorCompra;
    }

    public double retornoInversion (double invertido) {
        return invertido/this.valorCompra;
    }

}