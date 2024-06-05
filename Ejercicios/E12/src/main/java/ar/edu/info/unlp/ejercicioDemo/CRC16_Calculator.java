package ar.edu.info.unlp.ejercicioDemo;

import java.util.zip.CRC32;

public class CRC16_Calculator implements crcCalculator {
    
    public long crcFor (String data) {
        CRC32 crc = new CRC32();
        crc.update(data.getBytes());
        return crc.getValue();
    }

}
