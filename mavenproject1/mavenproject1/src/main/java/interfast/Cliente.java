/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfast;

/**
 *
 * @author USER
 */
public class Cliente extends Persona implements AtencionFarmacia {

    private int idCliente;
    private String telefono;

    public Cliente(int idCliente, String nombre, String apellido, String dni, String telefono) {
        super(nombre, apellido, dni);
        this.idCliente = idCliente;
        this.telefono = telefono;
    }

    @Override
    public void iniciarAtencion() {
        System.out.println(nombre + " llega a la farmacia y solicita atención");
    }

    @Override
    public void finalizarAtencion() {
        System.out.println(nombre + " se retira de la farmacia");
    }

    @Override
    public void mostrarEstado() {
        printStates();
    }

    void presentarReceta(String medicamento) {
        System.out.println(nombre + " presenta la receta de " + medicamento);
    }

    void realizarPago(double monto) {
        System.out.println(nombre + " paga S/ " + monto);
    }

    @Override
    void printStates() {
        System.out.println("idCliente:" + idCliente +
                           " nombre:" + nombre +
                           " apellido:" + apellido +
                           " dni:" + dni +
                           " telefono:" + telefono);
    }
    
}
