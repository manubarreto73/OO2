package ar.edu.info.unlp.ejercicioDemo;

public class Dispositivo {
    private Ringer ringer;
    private Display display;
    private Connection connection;
    private crcCalculator crcCalculator;

    public Dispositivo() {
        this.ringer = new Ringer();
        this.display = new Display();
        
    }

    public String send(String data) {
        long crc = this.crcCalculator.crcFor(data);
        return this.connection.sendData(data, (int)crc);
    }

    public void changeConnection (Connection connection) {
        this.connection = connection;
        display.showBanner(this.connection.pict());
        ringer.ring();
    }

    public void changeCalculator (crcCalculator calculator) {
        this.crcCalculator = calculator;
    }
}
