package ar.edu.info.unlp.ejercicioDemo;

import java.time.LocalDate;

public class PlazoFijo extends ProductoFinanciero {
    
    private int cantidadDias;
    private double interes;
    
    public PlazoFijo(LocalDate fecha, int cantidadDias, double interes) {
        super(fecha);
        this.cantidadDias = cantidadDias;
        this.interes = interes;
    }

    public double retornoInversion(double invertido) {
        return invertido * this.interes * this.cantidadDias;
    }

}
