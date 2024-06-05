package ar.edu.info.unlp.ejercicioDemo;

public class enConstruccionState extends proyectoState {
    
    public void aprobarEtapa(Proyecto proyecto) {
        if (proyecto.precioDelProyecto() == 0)
            throw new RuntimeException("El precio del proyecto es 0");
        proyecto.setState(new enEvaluacionState());
    }

    public void modificarMargenGanancia(Proyecto proyecto, double margenGanancia) {
        if (margenGanancia > 0.08 && margenGanancia < 0.11)
            return;
        proyecto.setGanancia(margenGanancia);
    }

}
