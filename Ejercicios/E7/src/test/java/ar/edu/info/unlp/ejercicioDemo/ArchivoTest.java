package ar.edu.info.unlp.ejercicioDemo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ArchivoTest {
	
	Archivo file;
	
	@BeforeEach
	void setUp() throws Exception {
		file = new Archivo("Practica 4", 73);
	}
	
    @Test
    public void testBuscar() {
        assertEquals(null, file.buscar("Practica 2"));
        assertEquals(file, file.buscar("Practica 4"));
    }

    @Test
    public void testBuscarTodos() {
        ArrayList<Component> lista = new ArrayList<Component>();
        file.buscarTodos("Practica 2", lista);
        assertEquals(true, lista.isEmpty());
        file.buscarTodos("Practica 4", lista);
        assertEquals(file, lista.get(0));
    }

    @Test
    public void testListadoDeContenido() {
        ArrayList<String> lista = new ArrayList<String>();
        file.listadoDeContenido("/Directorio1", lista);
        assertEquals("/Directorio1/Practica 4", lista.get(0));
    }
}
