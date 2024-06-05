package ar.edu.info.unlp.ejercicioDemo;

import java.util.ArrayList;

public class Tierra implements Topografia {

    public ArrayList<Topografia> getChildren() {
        return null;
    }

    public double proporcion() {
        return 0;
    }

    public boolean esIgual(Topografia aux) {
        return aux.proporcion() == 0;
    }

}