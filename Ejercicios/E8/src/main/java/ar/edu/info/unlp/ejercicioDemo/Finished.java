package ar.edu.info.unlp.ejercicioDemo;

import java.time.Duration;

public class Finished implements ToDoItemState{

    public void Start(ToDoItem item) {
        //no hace nada
    }

    public void togglePause(ToDoItem item) {
        throw new RuntimeException("La tarea ya finalizo");
    }

    public void finish(ToDoItem item) {
        //no hace nada
    }

    public Duration workedTime(ToDoItem item) {
        return Duration.between(item.getInicio(), item.getFin());
    }

    public void addComment(ToDoItem item, String comment) {
        //no hace nada
    }

}
