package paquete;

import java.util.Date;

public class Cobro {
    // Atributos de la clase Cobro
    private Date fecha;
    private float monto;
    private Cliente cliente;
    private Revision revision;
    private Empleado empleado;
    private Tarifa tarifa;

    /**
     * Constructor por defecto de la clase Cobro.
     */
    public Cobro() {
        // Constructor vacío por defecto
    }

    /**
     * Constructor parametrizado de la clase Cobro.
     *
     * @param fecha la fecha del cobro
     * @param monto el monto del cobro
     * @param revision la revisión asociada al cobro
     * @param empleado el empleado que realizó el cobro
     */
    public Cobro(Date fecha, float monto, Revision revision, Empleado empleado) {
        this.fecha = fecha;
        this.monto = monto;
        this.revision = revision;
        this.empleado = empleado;
    }

    // Getters y Setters
    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public float getMonto() {
        return monto;
    }

    public void setMonto(float monto) {
        this.monto = monto;
    }

    public Revision getRevision() {
        return revision;
    }

    public void setRevision(Revision revision) {
        this.revision = revision;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    public Tarifa getTarifa() {
        return tarifa;
    }

    public void setTarifa(Tarifa tarifa) {
        this.tarifa = tarifa;
    }

    /**
     * Método para realizar el cobro.
     *
     * @param monto el monto ingresado para el cobro
     */
    public void realizarCobro(double monto) {
        // Verifica si el monto ingresado coincide con el precio de la tarifa
        if (this.tarifa != null && monto == this.tarifa.getPrecio()) {
            System.out.println("Cobro realizado con éxito.");
        } else {
            System.out.println("Monto incorrecto. Por favor, ingrese el monto exacto.");
        }
    }
}
