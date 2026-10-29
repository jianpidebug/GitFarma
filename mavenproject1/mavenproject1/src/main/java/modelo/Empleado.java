package modelo;

import modelo.Persona;
import modelo.TipoContrato;

public class Empleado extends Persona {
    private int idEmpleado;
    private String cargo;
    private String nroColegiatura; 
    private String usuario;
    private String contraseña;
    private TipoContrato tipoContrato;

    private static int contadorEmpleados = 0; // Atributo estático

    public Empleado(int idEmpleado, String dni, String nombre, String apellido, 
                    String cargo, String nroColegiatura, String usuario, 
                    String contraseña, TipoContrato tipoContrato) {
        super(dni, nombre, apellido);
        this.idEmpleado = idEmpleado;
        this.cargo = cargo;
        this.nroColegiatura = nroColegiatura;
        this.usuario = usuario;
        this.contraseña = contraseña;
        this.tipoContrato = tipoContrato;
        contadorEmpleados++;
    }

    public static int getContadorEmpleados() { // Método estático
        return contadorEmpleados;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Empleado [ID: " + idEmpleado + ", Nombre: " + nombre + " " + apellido + 
                           ", Cargo: " + cargo + ", Contrato: " + tipoContrato.getNombre() + "]");
    }
}