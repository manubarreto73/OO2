package ar.edu.info.unlp.ejercicioDemo;

public class G4Adapter implements Connection {
    private G4Connection g4Connection;

    public G4Adapter () {
        this.g4Connection = new G4Connection("4G!!");
    }

    public String sendData(String data, int crc) {
        return this.g4Connection.sendData(data, crc);
    }

    public String pict() {
        return this.g4Connection.symb();
    }

}
