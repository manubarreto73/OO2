package ar.edu.info.unlp.ejercicioDemo;

import java.util.ArrayList;

public interface Topografia {

    public double proporcion();

    public boolean esIgual(Topografia aux);

    public ArrayList<Topografia> getChildren();

}