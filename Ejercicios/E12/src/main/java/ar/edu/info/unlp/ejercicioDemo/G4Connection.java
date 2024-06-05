package ar.edu.info.unlp.ejercicioDemo;

public class G4Connection {
    private String symb;

    public G4Connection (String symb) {
        this.symb = symb;
    }

    public String sendData(String data, int crc) {
        return "Envie la data usando 4GConnection";
    }

    public String symb() {
        return this.symb;
    }

}
