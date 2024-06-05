package ar.edu.info.unlp.ejercicioDemo;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class ToDoItem {
    private String name;
    private ToDoItemState state;
    private LocalDateTime inicio;
    private LocalDateTime fin;
    private ArrayList<String> comentarios;

    public ToDoItem (String name) {
        this.name = name;
        this.state = new Pending();
        this.comentarios = new ArrayList<String>();
    }

    public String getName () {
        return this.name;
    }

    public void setState (ToDoItemState state) {
        this.state = state;
    }

    //elijo hacer que el incio se setee desde afuera y no que se setee en el metodo start, porque sino se resetearia cuando llamen start de nuevo
    public void setInicio (LocalDateTime now) {
        this.inicio = now;
    }

    public LocalDateTime getInicio () {
        return this.inicio;
    }

    public void setFin (LocalDateTime now) {
        this.fin = now;
    }

    public LocalDateTime getFin () {
        return this.fin;
    }

    public ArrayList<String> getComentarios () {
        return this.comentarios;
    }

    public void start() {
        state.Start(this);
    }

    public void togglePause() {
        state.togglePause(this);
    }

    public void finish() {
        state.finish(this);
    }

    public Duration workedTime() {
        return state.workedTime(this);
    }

    public void addComment(String comment) {
        state.addComment(this, comment);
    }
}
