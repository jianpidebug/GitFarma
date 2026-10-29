package modelo;

public class DetalleVenta {
    private int idDetalleVenta;
    private int cantidad;
    private double precioUnitario;
    private double subtotal;
    private int idVenta;
    private DetalleMedicamento detalleMedicamento; // Relación con el lote/medicamento específico

    public DetalleVenta(int idDetalleVenta, int cantidad, double precioUnitario, int idVenta, DetalleMedicamento detalleMedicamento) {
        this.idDetalleVenta = idDetalleVenta;
        this.cantidad = cantidad;
        this.precioUnitario = precioUnitario;
        this.subtotal = cantidad * precioUnitario; // Cálculo automático
        this.idVenta = idVenta;
        this.detalleMedicamento = detalleMedicamento;
    }

    public double getSubtotal() { return subtotal; }
}