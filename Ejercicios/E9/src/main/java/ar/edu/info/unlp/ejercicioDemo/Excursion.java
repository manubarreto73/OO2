package ar.edu.info.unlp.ejercicioDemo;

import java.time.LocalDate;
import java.util.ArrayList;

public class Excursion {
    private String name;
    private LocalDate startDate;
    private LocalDate endDate;
    private String meetingPoint;
    private double price;
    private int minCapacity;
    private int maxCapacity;
    private ArrayList<Usuario> registeredList;
    private ArrayList<Usuario> waitingList;
    public ExcursionState state;

    public Excursion(String name, LocalDate startDate, LocalDate endDate, String meetingPoint, double price,
            int minCapacity, int maxCapacity) {
        this.name = name;
        this.startDate = startDate;
        this.endDate = endDate;
        this.meetingPoint = meetingPoint;
        this.price = price;
        this.minCapacity = minCapacity;
        this.maxCapacity = maxCapacity;
        this.registeredList = new ArrayList<Usuario>();
        this.waitingList = new ArrayList<Usuario>();
        this.state = new ExcursionEnEspera();
    }

    public void setState (ExcursionState state) {
        this.state = state;
    }

    public void addToRegisteredList (Usuario user) {
        this.registeredList.add(user);
    }

    public void addToWaitingList (Usuario user) {
        this.waitingList.add(user);
    }

    public void registerUser (Usuario user) {
        this.state.registerUser(this, user);
    }

    public String information () {
        return this.state.information(this);
    }

    public String getName() {
        return name;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public String getMeetingPoint() {
        return meetingPoint;
    }

    public double getPrice() {
        return price;
    }

    public int getMinCapacity() {
        return minCapacity;
    }

    public int getMaxCapacity() {
        return maxCapacity;
    }

    public int cantidadInscriptos() {
        return this.registeredList.size();
    }

}
