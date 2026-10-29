package modelo;

import interfaces.Auditable;
import java.util.Date;

public class Venta implements Auditable {
    private int idVenta;
    private Date fecha;
    private double total;
    private String metodoPago;
    private String estadoPago;
    private String referenciaPos;
    private Empleado empleado;
    private Cliente cliente;

    public Venta(int idVenta, Date fecha, double total, String metodoPago, String estadoPago, String referenciaPos, Empleado empleado, Cliente cliente) {
        this.idVenta = idVenta;
        this.fecha = fecha;
        this.total = total;
        this.metodoPago = metodoPago;
        this.estadoPago = estadoPago;
        this.referenciaPos = referenciaPos;
        this.empleado = empleado;
        this.cliente = cliente;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Venta ID: " + idVenta + " | Total: $" + total + " | Método: " + metodoPago + " | Empleado: " + empleado.getNombre());
    }

    public int getIdVenta() { return idVenta; }
    public double getTotal() { return total; }
}