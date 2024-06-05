package ar.edu.info.unlp.ejercicioDemo;

import java.time.LocalDate;

public class CompraDolares extends ProductoFinanciero {
    
    private double valorCompra;

    public CompraDolares(LocalDate fecha, double valorCompra) {
        super(fecha);
        this.valorCompra = valorCompra;
    }

    public double retornoInversion (double invertido) {
        return invertido/this.valorCompra;
    }

}
