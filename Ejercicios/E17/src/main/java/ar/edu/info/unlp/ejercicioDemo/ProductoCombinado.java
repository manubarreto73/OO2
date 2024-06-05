package ar.edu.info.unlp.ejercicioDemo;

import java.time.LocalDate;
import java.util.List;

public class ProductoCombinado extends ProductoFinanciero {
    
    private List<ProductoFinanciero> inversiones;

    public ProductoCombinado(LocalDate fecha, List<ProductoFinanciero> inversiones) {
        super(fecha);
        this.inversiones = inversiones;
    }

    public double retornoInversion(double invertido) {
        for (ProductoFinanciero P : inversiones) {
            invertido = P.retornoInversion(invertido);
        }
        return invertido;
    }

}
