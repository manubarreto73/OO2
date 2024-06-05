package ar.edu.info.unlp.ejercicioDemo;

public class ExcursionEnEspera implements ExcursionState{
    
    public void registerUser (Excursion excursion, Usuario user) {
        excursion.addToRegisteredList(user);
        if (excursion.cantidadInscriptos() == excursion.getMinCapacity())
            excursion.setState(new ExcursionDisponible());
    }

    public String information (Excursion excursion) {
        return String.format("Excursion: %s _", null);
    }

}
