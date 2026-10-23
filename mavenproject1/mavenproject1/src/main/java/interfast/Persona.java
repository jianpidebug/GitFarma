/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfast;

/**
 *
 * @author USER
 */
public class Persona {
    protected String nombre;
    protected String apellido;
    protected String dni;

    public Persona(String nombre, String apellido, String dni) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
    }

    void printStates() {
        System.out.println("nombre:" + nombre +
            " apellido:" + apellido +
            " dni:" + dni);
    } 
}
