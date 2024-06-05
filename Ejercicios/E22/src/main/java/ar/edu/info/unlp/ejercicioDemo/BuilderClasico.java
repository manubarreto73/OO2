package ar.edu.info.unlp.ejercicioDemo;

public class BuilderClasico extends Builder {
    
    public Builder pan() {
        this.ingredientes.add(new Ingrediente("Pan brioche", 100));
        return this;
    }

    public Builder principal() {
        this.ingredientes.add(new Ingrediente("Carne de ternera", 300));
        return this;
    }

    public Builder adicional() {
        this.ingredientes.add(new Ingrediente("Tomate", 80));
        return this;
    }

    public Builder aderezo() {
        this.ingredientes.add(new Ingrediente("Mayonesa", 20));
        return this;
    }

    public Sandwich build() {
        return new Sandwich(this.ingredientes);
    }

}
