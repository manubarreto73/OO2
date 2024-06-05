package ar.edu.info.unlp.ejercicioDemo;

import java.util.List;

public abstract class WeatherDecorator extends WeatherData {
    
    protected WeatherData component;

    public double getTemperatura() {
        return this.component.getTemperatura();
    }

    public double getPresion() {
        return this.component.getPresion();
    }

    public double getRadiacionSolar() {
        return this.component.getRadiacionSolar();
    }

    public List<Double> getTemperaturas() {
        return this.component.getTemperaturas();
    }

    public abstract String displayData();

}
