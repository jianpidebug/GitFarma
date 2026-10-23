/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfast;

/**
 *
 * @author USER
 */
public class QuimicoFarmaceutico extends Persona implements AtencionFarmacia {

    private int idQuimico;
    private String nroColegiatura;
    private String turno;

    public QuimicoFarmaceutico(int idQuimico, String nombre, String apellido, String dni,
                               String nroColegiatura, String turno) {
        super(nombre, apellido, dni);
        this.idQuimico = idQuimico;
        this.nroColegiatura = nroColegiatura;
        this.turno = turno;
    }

    @Override
    public void iniciarAtencion() {
        System.out.println("QF " + nombre + " empieza a atender al cliente");
    }

    @Override
    public void finalizarAtencion() {
        System.out.println("QF " + nombre + " termina la atención");
    }

    @Override
    public void mostrarEstado() {
        printStates();
    }

    void dispensarMedicamento(String medicamento) {
        System.out.println("QF " + nombre + " entrega " + medicamento);
    }

    void emitirComprobante(double monto) {
        System.out.println("QF " + nombre + " emite comprobante por S/ " + monto);
    }

    @Override
    void printStates() {
        System.out.println("idQuimico:" + idQuimico +
                           " nombre:" + nombre +
                           " apellido:" + apellido +
                           " dni:" + dni +
                           " nroColegiatura:" + nroColegiatura +
                           " turno:" + turno);
    }
    
}
