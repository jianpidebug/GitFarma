package modelo;

import modelo.Persona;

public class Cliente extends Persona {
    private int idCliente;
    private String telefono;

    public Cliente(int idCliente, String dni, String nombre, String apellido, String telefono) {
        super(dni, nombre, apellido);
        this.idCliente = idCliente;
        this.telefono = telefono;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Cliente [ID: " + idCliente + ", Nombre: " + nombre + " " + apellido + 
                           ", Teléfono: " + telefono + "]");
    }
}