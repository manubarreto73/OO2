package ar.edu.info.unlp.ejercicioDemo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TopografiaTest {
	
	Topografia e1, e2, e3, e4;
	
	@BeforeEach
	void setUp() throws Exception {
		e1 = new Agua();
        e2 = new Tierra();
        e3 = new Mixta(new Agua(), new Tierra(), new Tierra(), new Agua());
        e4 = new Mixta(new Agua(), new Tierra(), new Tierra(), e3);
	}
	
    @Test
    public void testPropociones() {
        assertEquals(1, e1.proporcion());
        assertEquals(0, e2.proporcion());
        assertEquals(0.5, e3.proporcion());
        assertEquals(0.375, e4.proporcion());
    }

    @Test
    public void testComparaciones() {
        assertEquals(true, e1.esIgual(new Agua()));
        assertEquals(true, e2.esIgual(new Tierra()));
        assertEquals(true, e3.esIgual(new Mixta(new Agua(), new Tierra(), new Tierra(), new Agua())));
        assertEquals(false, e3.esIgual(new Mixta(new Agua(), new Tierra(), new Agua(), new Tierra())));
    }
}