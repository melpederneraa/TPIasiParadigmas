package paquete;

import java.util.Date;

public class Oblea {
    // Atributos de la clase Oblea
    private int idOblea;
    private Date fechaMedicion;
    private String estado;
    private Revision revison;


    public Oblea(int idOblea, Date fechaMedicion,String estado) {
        this.idOblea = idOblea;
        this.fechaMedicion = fechaMedicion;
        this.estado = estado;
    }

    public int getIdOblea() {
        return idOblea;
    }

    public void setIdOblea(int idOblea) {
        this.idOblea = idOblea;
    }

    public Date getFechaMedicion() {
        return fechaMedicion;
    }

    public void setFechaMedicion(Date fechaMedicion) {
        this.fechaMedicion = fechaMedicion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Revision getRevison() {
        return revison;
    }

    public void setRevison(Revision revison) {
        this.revison = revison;
    }
}
