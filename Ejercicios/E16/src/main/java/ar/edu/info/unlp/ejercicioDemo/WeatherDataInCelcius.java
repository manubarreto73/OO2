package ar.edu.info.unlp.ejercicioDemo;

import java.util.List;
import java.util.stream.Collectors;

public class WeatherDataInCelcius extends WeatherData {
    
    private HomeWeatherStation data;

    public WeatherDataInCelcius (HomeWeatherStation data) {
        this.data = data;
    }

    public double getTemperatura() {
        return (this.data.getTemperatura() - 32) / 1.8;
    }

    public double getPresion() {
        return this.data.getPresion();
    }

    public double getRadiacionSolar() {
        return this.data.getRadiacionSolar();
    }

    public List<Double> getTemperaturas() {
        return this.data.getTemperaturas().stream().mapToDouble(T -> (T - 32) / 1.8).boxed().collect(Collectors.toList());
    }

    public String displayData() {
        return "Temperatura C: " + this.getTemperatura() + "\n" + "Presión atmosf: " + this.getPresion() + "\n" + "Radiación solar: " + this.getRadiacionSolar();
    }

}
