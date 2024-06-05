package ar.edu.info.unlp.ejercicioDemo;

public class PromedioDecorator extends WeatherDecorator {
    
    public String displayData() {
        return this.displayData() + "Promedio: " + this.getTemperaturas().stream().mapToDouble(T -> T).average().toString();
    }

}
