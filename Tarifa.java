package paquete;

import java.util.Date;

public class Tarifa {
    // Atributos de la clase Tarifa
    private String descripcion;
    private float precio;
    private Date fecha;

    /**
     * Constructor por defecto de la clase Tarifa.
     */
    public Tarifa() {
        // Constructor vacío por defecto
    }

    /**
     * Constructor parametrizado de la clase Tarifa.
     *
     * @param descripcion la descripción de la tarifa
     * @param precio el precio de la tarifa
     * @param fecha la fecha asociada a la tarifa
     */
    public Tarifa(String descripcion, float precio, Date fecha) {
        this.descripcion = descripcion;
        this.precio = precio;
        this.fecha = fecha;
    }

    // Getters y Setters
    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
}
