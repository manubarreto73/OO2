package ar.edu.info.unlp.ejercicioDemo;

import java.time.LocalDate;
import java.util.Random;

public class CompraBonoBajoRiesgo extends ProductoFinanciero {
    
    private int parking;

    public CompraBonoBajoRiesgo(LocalDate fecha, int parking) {
        super(fecha);
        this.parking = parking;
    }

    public double retornoInversion(double invertido) {
        return invertido + (new Random().nextInt(21) - 10) / 100 * invertido;
    }

}
