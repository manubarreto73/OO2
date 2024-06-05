package ar.edu.info.unlp.ejercicioDemo;

import java.time.LocalDate;

public abstract class ProductoFinanciero {
    
    private LocalDate fechaOperacion;
    
    public ProductoFinanciero (LocalDate fecha) {
        this.fechaOperacion = fecha;
    }

    public abstract double retornoInversion (double invertido);

}
