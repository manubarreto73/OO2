package ar.edu.info.unlp.ejercicioDemo;

public class MinMaxDecorator extends WeatherDecorator  {
    
    public String displayData() {
        return this.displayData() + "Maximo: " + this.getTemperaturas().stream().mapToDouble(T -> T).max().toString() + "Minimo: " + this.getTemperaturas().stream().mapToDouble(T -> T).min().toString();
    }

}
