package ar.edu.info.unlp.ejercicioDemo;

public class enEvaluacionState extends proyectoState {
    
    public void aprobarEtapa(Proyecto proyecto) {
        proyecto.setState(new confirmadoState());
    }

    public void modificarMargenGanancia(Proyecto proyecto, double margenGanancia) {
        if (margenGanancia > 0.11 && margenGanancia < 0.15)
            return;
        proyecto.setGanancia(margenGanancia);
    }

}
