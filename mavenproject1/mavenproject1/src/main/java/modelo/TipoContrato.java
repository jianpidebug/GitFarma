/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author PIOJUNESJADHIRAARACE
 */
public class TipoContrato {
    private int idTipoContrato;
    private String nombre;

    public TipoContrato(int idTipoContrato, String nombre) {
        this.idTipoContrato = idTipoContrato;
        this.nombre = nombre;
    }

    public String getNombre() { return nombre; }
}

