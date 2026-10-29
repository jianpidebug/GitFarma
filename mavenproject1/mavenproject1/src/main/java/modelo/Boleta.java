package modelo;

import interfaces.Auditable;
import java.util.Date;

public class Boleta implements Auditable {
    private int idBoleta;
    private String serie;
    private String numero; // Recibe el número de boleta explícitamente
    private Date fechaEmision;
    private double total;
    private int idVenta;

    // Constructor con los 6 argumentos que pide el Main
    public Boleta(int idBoleta, String serie, String numero, Date fechaEmision, double total, int idVenta) {
        this.idBoleta = idBoleta;
        this.serie = serie;
        this.numero = numero;
        this.fechaEmision = fechaEmision;
        this.total = total;
        this.idVenta = idVenta;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Boleta N°: " + serie + "-" + numero + " | Total: $" + total);
    }

    public int getIdBoleta() { return idBoleta; }
}