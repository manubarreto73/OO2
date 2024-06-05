package ar.edu.info.unlp.ejercicioDemo;

public class BuilderVegano extends Builder {
    
    public Builder pan() {
        this.ingredientes.add(new Ingrediente("Pan integral", 100));
        return this;
    }

    public Builder principal() {
        this.ingredientes.add(new Ingrediente("Milanesa de girgolas", 500));
        return this;
    }

    public Builder aderezo() {
        this.ingredientes.add(new Ingrediente("Salsa criolla", 20));
        return this;
    }

    public Sandwich build() {
        return new Sandwich(this.ingredientes);
    }

}
