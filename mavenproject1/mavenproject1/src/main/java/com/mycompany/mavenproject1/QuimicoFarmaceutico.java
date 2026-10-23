/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author USER
 */
public class QuimicoFarmaceutico {
   private int idQuimico;
    private String nombre;
    private String apellido;
    private String dni;
    private String nroColegiatura;
    private String turno;

    public QuimicoFarmaceutico(int idQuimico, String nombre, String apellido, String dni,
                               String nroColegiatura, String turno) {
        this.idQuimico = idQuimico;
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.nroColegiatura = nroColegiatura;
        this.turno = turno;
    }

    void validarReceta(String medicamento) {
        System.out.println("QF " + nombre + " valida la receta de " + medicamento);
    }

    void dispensarMedicamento(String medicamento) {
        System.out.println("QF " + nombre + " entrega " + medicamento);
    }

    void orientarCliente(String medicamento) {
        System.out.println("QF " + nombre + " explica dosis y uso de " + medicamento);
    }

    void emitirComprobante(double monto) {
        System.out.println("QF " + nombre + " emite comprobante por S/ " + monto);
    }

    void cambiarTurno(String nuevoTurno) {
        turno = nuevoTurno;
    }

    void printStates() {
        System.out.println("id:" + idQuimico +
            " nombre:" + nombre +
            " apellido:" + apellido +
            " dni:" + dni +
            " nroColegiatura:" + nroColegiatura +
            " turno:" + turno);
    }
}

