package ar.edu.info.unlp.ejercicioDemo;

public class WifiConn implements Connection {
    private String pict;

    public WifiConn (String pict) {
        this.pict = pict;
    }

    public String sendData(String data, int crc) {
        return "Envie la información con WifiConn";
    }

    public String pict() {
        return pict;
    }

}
