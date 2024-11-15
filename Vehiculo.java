package paquete;

import java.util.Date;

public class Vehiculo
{
    // instance variables - replace the example below with your own
    private String marca;
    private String modelo;
    private String numeroChasis;
    private String patente;
    private Date anioFabricacion;

    public Vehiculo(String marca,String modelo,String numeroChasis,String patente,Date anioFabricacion) {
        this.marca = marca;
        this.modelo = modelo;
        this.numeroChasis = numeroChasis;
        this.patente = patente;
        this.anioFabricacion = anioFabricacion;
    }

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

    public String getNumeroChasis() {
        return numeroChasis;
    }

    public void setNumeroChasis(String numeroChasis) {
        this.numeroChasis = numeroChasis;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public Date getAnioFabricacion() {
        return anioFabricacion;
    }

    public void setAnioFabricacion(Date anioFabricacion) {
        this.anioFabricacion = anioFabricacion;
    }
}

