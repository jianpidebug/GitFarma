/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author USER
 */
public class Cliente {
    private int idCliente;
    private String nombre;
    private String apellido;
    private String dni;
    private String telefono;
    
    public Cliente(int idCliente, String nombre,String apellido,String dni, String telefono ){
      this.idCliente=idCliente;
      this.nombre=nombre;
      this.apellido=apellido;
      this.dni=dni;
      this.telefono =telefono;
     }
    
    void solicitarMedicamento(String medicamento){
        System.out.println(nombre+"solicita"+medicamento);
    }
     void presentarReceta(String medicamento) {
        System.out.println(nombre + " presenta la receta de " + medicamento);
    }

    void realizarPago(double monto) {
        System.out.println(nombre + " paga S/ " + monto);
    }

    void actualizarTelefono(String nuevoTelefono) {
        telefono = nuevoTelefono;
    }

    void printStates(){
        System.out.println("id:" + idCliente +
                "nombre:" + nombre +
                "apellido:"+ apellido+
                "dni:"+ dni + 
                "telefono:" + telefono);
    }
}
