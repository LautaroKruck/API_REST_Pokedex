package pokedex.dto;

public class PokemonDTO {

    private String nombre;
    private int vida;
    private TipoDTO tipo;
    private AtaqueDTO ataque;

    public PokemonDTO(){}
    public PokemonDTO(String nombre, int vida, TipoDTO tipo, AtaqueDTO ataque) {
        this.nombre = nombre;
        this.vida = vida;
        this.tipo = tipo;
        this.ataque = ataque;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public TipoDTO getTipo() {
        return tipo;
    }

    public void setTipo(TipoDTO tipo) {
        this.tipo = tipo;
    }

    public AtaqueDTO getAtaque() {
        return ataque;
    }

    public void setAtaque(AtaqueDTO ataque) {
        this.ataque = ataque;
    }

    @Override
    public String toString() {
        return "PokemonDTO{" +
                "nombre='" + nombre + '\'' +
                ", vida=" + vida +
                ", tipo=" + tipo +
                ", ataque=" + ataque +
                '}';
    }
}
