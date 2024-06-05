class Adapter {
    private CombinedMatrixSensor adaptee;

    public Adapter() {
        this.adaptee = new CombinedMatrixSensor();
    }

    public double acquireTemp() {
        return this.adaptee.acquireSensor(1);
    }

    public double acquireHumid() {
        return this.adaptee.acquireSensor(2);
    }

    public void reset() {
        this.adaptee.reset();
    }

    public void autocalibrate() {
        this.adaptee.autocalibrate(); //No sé qué pasarle como parámetro
    }

}