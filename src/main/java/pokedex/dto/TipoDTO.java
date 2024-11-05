package pokedex.dto;

public class TipoDTO {

    private String nombre;

    public TipoDTO(){}
    public TipoDTO(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
