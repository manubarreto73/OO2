package ar.edu.info.unlp.ejercicioDemo;

import java.util.ArrayList;

public class Mixta implements Topografia {
    private ArrayList<Topografia> componentes;

    //elijo recibir los elementos y no la lista para no forzar a quién me envíe la lista a tener una copia
    public Mixta (Topografia c1, Topografia c2, Topografia c3, Topografia c4) {
        this.componentes = new ArrayList<Topografia>();
        this.componentes.add(c1);
        this.componentes.add(c2);
        this.componentes.add(c3);
        this.componentes.add(c4);
    }

    public ArrayList<Topografia> getChildren() {
        return this.componentes;
    }

    public double proporcion() {
        double aux = this.componentes.stream()
            .mapToDouble(componente -> componente.proporcion())
            .sum();
        return aux/4;
    }

    //tambien se puede resolver sobreescribiendo el equals es los hijos, pero tendrías que sacrificar que no piden
    public boolean esIgual(Topografia aux) {
        return this.componentes.get(0).esIgual(aux.getChildren().get(0)) &&
            this.componentes.get(1).esIgual(aux.getChildren().get(1)) &&
            this.componentes.get(2).esIgual(aux.getChildren().get(2)) &&
            this.componentes.get(3).esIgual(aux.getChildren().get(3));
    }

}