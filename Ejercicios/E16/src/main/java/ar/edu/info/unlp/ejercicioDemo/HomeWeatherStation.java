package ar.edu.info.unlp.ejercicioDemo;

import java.util.List;

public class HomeWeatherStation extends WeatherData {

    private double temperatura;
    private double presion;
    private double radiacionSolar;
    private List<Double> historialTemperaturas;

    public HomeWeatherStation (double T, double P, double RS, List<Double> hT) {
        this.temperatura = T;
        this.presion = P;
        this.radiacionSolar = RS;
        this.historialTemperaturas = hT;
    }

    public double getTemperatura() {
        return temperatura;
    }

    public double getPresion() {
        return presion;
    }

    public double getRadiacionSolar() {
        return radiacionSolar;
    }

    public List<Double> getTemperaturas() {
        return this.historialTemperaturas;
    }

    public String displayData() {
        return "Temperatura F: " + this.getTemperatura() + "\n" + "Presión atmosf: " + this.getPresion() + "\n" + "Radiación solar: " + this.getRadiacionSolar();
    }

}