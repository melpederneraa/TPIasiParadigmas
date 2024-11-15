package paquete;

public class Cliente extends Persona {
    // Atributos de la clase Cliente
    private Domicilio domicilio;
    private Vehiculo vehiculo;

    /**
     * Constructor por defecto de la clase Cliente.
     */
    public Cliente() {
        // Constructor vacío por defecto
    }

    /**
     * Constructor parametrizado de la clase Cliente.
     *
     * @param domicilio el domicilio del cliente
     * @param vehiculo el vehículo del cliente
     */
    public Cliente(Domicilio domicilio, Vehiculo vehiculo) {
        this.domicilio = domicilio;
        this.vehiculo = vehiculo;
    }

    // Getters y Setters

    public void setDomicilio(Domicilio domicilio) {
        this.domicilio = domicilio;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }
}
