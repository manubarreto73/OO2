package ar.edu.info.unlp.ejercicioDemo;

import java.util.List;

public abstract class WeatherData {
    
    public abstract double getTemperatura();

    public abstract double getPresion();

    public abstract double getRadiacionSolar();

    public abstract List<Double> getTemperaturas();

    public String displayData() {
        return "Temperatura F: " + this.getTemperatura() + "\n" + "Presión atmosf: " + this.getPresion() + "\n" + "Radiación solar: " + this.getRadiacionSolar();
    }

}
