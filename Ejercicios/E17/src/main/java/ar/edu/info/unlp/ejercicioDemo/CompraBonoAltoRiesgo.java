package ar.edu.info.unlp.ejercicioDemo;

import java.time.LocalDate;
import java.util.Random;

public class CompraBonoAltoRiesgo extends ProductoFinanciero {
    
    private int parking;

    public CompraBonoAltoRiesgo(LocalDate fecha, int parking) {
        super(fecha);
        this.parking = parking;
    }

    public double retornoInversion(double invertido) {
        return invertido + (new Random().nextInt(141) - 70) / 100 * invertido;
    }

}
