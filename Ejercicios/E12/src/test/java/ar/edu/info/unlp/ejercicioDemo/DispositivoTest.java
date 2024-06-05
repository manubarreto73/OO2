package ar.edu.info.unlp.ejercicioDemo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DispositivoTest {
	
	Dispositivo dispositivo;
	
	@BeforeEach
	void setUp() throws Exception {
		dispositivo = new Dispositivo();
        dispositivo.changeConnection(new WifiConn("Wifi!!"));
		dispositivo.changeCalculator(new CRC16_Calculator());
	}
	
    @Test
    public void send() {
        assertEquals("Envie la data usando WifiConn", dispositivo.send("Mensajito fachero"));
        dispositivo.changeConnection(new G4Adapter());
        assertEquals("Envie la data usando 4GConnection", dispositivo.send("Mensajito fachero"));
    }

	@Test
    public void conectarCon() {
        
    }

	@Test
    public void configurarCRC() {
        
    }
}
