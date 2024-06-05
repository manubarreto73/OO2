package ar.edu.info.unlp.ejercicioDemo;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class InProgress implements ToDoItemState{

    public void Start(ToDoItem item) {
        //no hace nada
    }

    public void togglePause(ToDoItem item) {
        item.setState(new Paused());
    }

    public void finish(ToDoItem item) {
        item.setFin(LocalDateTime.now());
        item.setState(new Finished());
    }  

    public Duration workedTime(ToDoItem item) {
        return Duration.between(item.getInicio(), LocalDate.now());
    }

    public void addComment(ToDoItem item, String comment) {
        item.getComentarios().add(comment);
    }

}
