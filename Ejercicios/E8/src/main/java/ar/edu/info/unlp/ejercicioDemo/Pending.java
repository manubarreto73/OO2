package ar.edu.info.unlp.ejercicioDemo;

import java.time.Duration;
import java.time.LocalDateTime;

public class Pending implements ToDoItemState{
    
    public void Start(ToDoItem item) {
        item.setInicio(LocalDateTime.now());
        item.setState(new InProgress());
    }

    public void togglePause(ToDoItem item) {
        throw new RuntimeException("La tarea no fue iniciada");
    }

    public void finish(ToDoItem item) {
        //no hace nada
    }

    public Duration workedTime(ToDoItem item) {
        throw new RuntimeException("La tarea no fue iniciada");
    }

    public void addComment(ToDoItem item, String comment) {
        item.getComentarios().add(comment);
    }

}
