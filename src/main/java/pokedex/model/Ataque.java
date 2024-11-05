package pokedex.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "ataques")
public class Ataque {

    @Column(nullable = false)
    private int danioBase;
    @Column(nullable = false)
    private boolean isEspecial;
    @OneToOne
    @JoinColumn(name = "id_tipo")
    private Tipo tipo;

    @ManyToMany(mappedBy = "ataques", fetch = FetchType.LAZY)
    private List<Pokemon> pokemon;

    @Id
    private String nombre;

    public Ataque(int danioBase, boolean isEspecial, Tipo tipo, String nombre) {
        this.danioBase = danioBase;
        this.isEspecial = isEspecial;
        this.tipo = tipo;
        this.nombre = nombre;
    }

    public Ataque(){}

    public int getDanioBase() {
        return danioBase;
    }

    public void setDanioBase(int danioBase) {
        this.danioBase = danioBase;
    }

    public boolean isEspecial() {
        return isEspecial;
    }

    public void setEspecial(boolean especial) {
        isEspecial = especial;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Pokemon> getPokemon() {
        return pokemon;
    }

    public void setPokemon(List<Pokemon> pokemon) {
        this.pokemon = pokemon;
    }
}