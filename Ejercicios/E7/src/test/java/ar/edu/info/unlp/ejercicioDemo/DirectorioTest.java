package ar.edu.info.unlp.ejercicioDemo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;
import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DirectorioTest {
	
	Directorio folder, folderB;
    Archivo fileA, fileB, fileC;
	
	@BeforeEach
	void setUp() throws Exception {
		folder = new Directorio("Directorio1");
        folderB = new Directorio("Directorio2");
        fileA = new Archivo("FileA", 20);
        fileB = new Archivo("FileB", 10);
        fileC = new Archivo("FileC", 40);
        folder.add(fileA);
        folder.add(fileB);
        folderB.add(fileC);
        folder.add(folderB);
	}
	
    @Test
    public void testSize() {
        assertEquals(72, folderB.size());
        assertEquals(134, folder.size());
    }

    @Test
    public void testArchivoMasGrande() {
        assertEquals(fileC, folderB.archivoMasGrande());
        assertEquals(fileC, folder.archivoMasGrande());
    }

    @Test
    public void testArchivoMasNuevo() {
        fileA.setDate(LocalDate.now().minusDays(4));
        fileC.setDate(LocalDate.now().minusDays(2));
        assertEquals(fileC, folderB.archivoMasNuevo());
        assertEquals(fileB, folder.archivoMasNuevo());
    }

    @Test
    public void testBuscar() {
        assertEquals(folder, folder.buscar("Directorio1"));
        assertEquals(folderB, folder.buscar("Directorio2"));
        assertEquals(fileA, folder.buscar("FileA"));
        assertEquals(fileC, folder.buscar("FileC"));
    }

    @Test
    public void testBuscarTodos() {
        folder.add(new Directorio("File A"));
        folderB.add(new Archivo("FileA", 10));
        ArrayList<Component> lista = new ArrayList<Component>();
        folder.buscarTodos("FileA", lista);
        assertEquals(2, lista.size());
    }

    @Test
    public void testListadoDeContenido() {
        ArrayList<String> lista = new ArrayList<String>();
        folder.listadoDeContenido("/", lista);
        for (String string : lista) {
            System.out.println(string);
        }
    }
}