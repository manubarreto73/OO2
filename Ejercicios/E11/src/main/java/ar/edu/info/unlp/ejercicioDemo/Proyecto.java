package ar.edu.info.unlp.ejercicioDemo;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Proyecto {
    private String nombre;
    private String objetivo;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;
    private int numIntegrantes;
    private double costoIntegrante;
    private double margenGanancia;
    private proyectoState state;

    static String prefijoCancelacion = "(cancelado) ";

    public Proyecto(String nombre, String objetivo, LocalDate fechaInicio, LocalDate fechaFin, Integer numIntegrantes, double costoIntegrante) {
        this.nombre = nombre;
        this.objetivo = objetivo;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.numIntegrantes = numIntegrantes;
        this.costoIntegrante = costoIntegrante;
        this.margenGanancia = 0.07;
        this.state = new enConstruccionState();
    }

    public String getObjetivo() {
        return this.objetivo;
    }

    public void aprobarEtapa() {
        state.aprobarEtapa(this);
    }

    private long duracionProyecto() {
        return ChronoUnit.DAYS.between(fechaInicio, fechaFin);
    }

    public double costoDelProyecto() {
        return duracionProyecto() * this.numIntegrantes * this.costoIntegrante;
    }

    //Lo entiendo como las ganancias que genera, no por el nombre que le ponen sino por la explicación
    public double precioDelProyecto() {
        return costoDelProyecto() + costoDelProyecto() * this.margenGanancia;
    }

    public void modificarMargenGanancia(double margenGanancia) {
        state.modificarMargenGanancia(this);
    }

    private boolean cancelado() {
        return this.nombre.startsWith(prefijoCancelacion);
    }

    public void cancelarProyecto() {
        if (cancelado())
            return;
        this.nombre = prefijoCancelacion + this.nombre;
    }
    
    public void setState(proyectoState state) {
        this.state = state;
    }

    public void setGanancia(double margenGanancia) {
        this.margenGanancia = margenGanancia;
    }

}
