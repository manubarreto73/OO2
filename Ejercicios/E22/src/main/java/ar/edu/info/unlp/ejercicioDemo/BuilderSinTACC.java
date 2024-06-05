package ar.edu.info.unlp.ejercicioDemo;

public class BuilderSinTACC extends Builder {
    
    public Builder pan() {
        this.ingredientes.add(new Ingrediente("Pan de chipa", 150));
        return this;
    }

    public Builder principal() {
        this.ingredientes.add(new Ingrediente("Carne de pollo", 12508));
        return this;
    }

    public Builder adicional() {
        this.ingredientes.add(new Ingrediente("Verduras grilladas", 200));
        return this;
    }

    public Builder aderezo() {
        this.ingredientes.add(new Ingrediente("Salsa de tartara", 18));
        return this;
    }

    public Sandwich build() {
        return new Sandwich(this.ingredientes);
    }

}
