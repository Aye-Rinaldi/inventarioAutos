package ar.com.xeven;

public class Auto {
    //atributos
    private String marca;
    private String modelo;
    private String anio;
    private Integer precio;

    //contructor
    public Auto(String marca, String modelo, String anio, Integer precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.precio = precio;
    }

    //getters y setters
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getAnio() {
        return anio;
    }

    public void setAnio(String anio) {
        this.anio = anio;
    }

    public Integer getPrecio() {
        return precio;
    }

    public void setPrecio(Integer precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return marca+"\t"+modelo+"("+anio+")"+": $"+precio;
    }
}
