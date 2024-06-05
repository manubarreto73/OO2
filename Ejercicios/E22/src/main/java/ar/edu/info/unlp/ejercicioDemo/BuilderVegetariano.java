package ar.edu.info.unlp.ejercicioDemo;

public class BuilderVegetariano extends Builder {
    
    public Builder pan() {
        this.ingredientes.add(new Ingrediente("Pan con semillas", 100));
        return this;
    }

    public Builder principal() {
        this.ingredientes.add(new Ingrediente("Provoleta grillada", 300));
        return this;
    }

    public Builder adicional() {
        this.ingredientes.add(new Ingrediente("Berenjenas al escabeche", 100));
        return this;
    }

    public Sandwich build() {
        return new Sandwich(this.ingredientes);
    }

}
