package ar.edu.info.unlp.ejercicioDemo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ToDoItemTest {
	
	ToDoItem item;
	
	@BeforeEach
	void setUp() throws Exception {
		item = new ToDoItem("Práctica 6 CPLP");
	}
	
    @Test
    public void testPendding() {
        
    }

    @Test
    public void testInProgress() {
        
    }

    @Test
    public void testPaused() {
        
    }

    @Test
    public void testFinished() {
        
    }
}

