package pokedex.dto;

public class AtaqueDTO {
    private String nombre;
    private int danioBase;
    private boolean isEspecial;
    private TipoDTO tipo;

    public AtaqueDTO(){}
    public AtaqueDTO(String nombre, int danioBase, boolean isEspecial, TipoDTO tipo) {
        this.nombre = nombre;
        this.danioBase = danioBase;
        this.isEspecial = isEspecial;
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

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

    public TipoDTO getTipo() {
        return tipo;
    }

    public void setTipo(TipoDTO tipo) {
        this.tipo = tipo;
    }
}
