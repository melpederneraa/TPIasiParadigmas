package paquete;

import java.util.Date;
import java.util.List;
public class Revision {
    // Atributos de la clase Revision
    private int idRevision;
    private String estado;
    private Date fechaAlta;
    private Date fechaRealizacion;
    private Empleado empleado;
    private Vehiculo vehiculo;
    private Medicion medicion;
    private DefectoVisual defectoVisual;
    private String observacionesFinales;
    private Date fechaVencimiento;
    private String proximaRevision;
    private String motivoRechazo;


    public Revision(int idRevision,String estado,Date fechaAlta, Date fechaRealizacion,Empleado empleado, Vehiculo vehiculo,
                    Medicion medicion,DefectoVisual defectoVisual,
                    String observacionesFinales, Date fechaVencimiento,
                    String proximaRevision, String motivoRechazo) {
        this.idRevision = idRevision;
        this.estado = estado;
        this.fechaAlta = fechaAlta;
        this.fechaRealizacion = fechaRealizacion;
        this.empleado=empleado;
        this.vehiculo = vehiculo;
        this.medicion = medicion;
        this.defectoVisual = defectoVisual;
        this.observacionesFinales = observacionesFinales;
        this.fechaVencimiento = fechaVencimiento;
        this.proximaRevision = proximaRevision;
        this.motivoRechazo = motivoRechazo;
    }

    // Getters y Setters
    public int getIdRevision() {
        return idRevision;
    }

    public void setIdRevision(int idRevision) {
        this.idRevision = idRevision;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    public Date getFechaRealizacion() {
        return fechaRealizacion;
    }

    public void setFechaRealizacion(Date fechaRealizacion) {
        this.fechaRealizacion = fechaRealizacion;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public Medicion getMedicion() {
        return medicion;
    }

    public void setMedicion(Medicion medicion) {
        this.medicion = medicion;
    }

    public DefectoVisual getDefectoVisual() {
        return defectoVisual;
    }

    public void setDefectoVisual(DefectoVisual defectoVisual) {
        this.defectoVisual = defectoVisual;
    }

    public Date getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(Date fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public Date getFechaAlta() {
        return fechaAlta;
    }

    public void setFechaAlta(Date fechaAlta) {
        this.fechaAlta = fechaAlta;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getObservacionesFinales() {
        return observacionesFinales;
    }

    public void setObservacionesFinales(String observacionesFinales) {
        this.observacionesFinales = observacionesFinales;
    }

    public String getProximaRevision() {
        return proximaRevision;
    }

    public void setProximaRevision(String proximaRevision) {
        this.proximaRevision = proximaRevision;
    }

    public String getMotivoRechazo() {
        return motivoRechazo;
    }

    public void setMotivoRechazo(String motivoRechazo) {
        this.motivoRechazo = motivoRechazo;
    }
}
