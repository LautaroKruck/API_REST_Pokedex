package pokedex.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tipos")
public class Tipo {

    @Id
    private String tipo;

    public Tipo(String tipo) {
        this.tipo = tipo;
    }

    public Tipo() {}

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
