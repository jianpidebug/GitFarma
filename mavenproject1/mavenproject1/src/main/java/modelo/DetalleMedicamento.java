package modelo;

import interfaces.Auditable;
import java.util.Date;

public class DetalleMedicamento implements Auditable {
    private int idDetalleMedicamento;
    private String nroLote;
    private Date fechaVencimiento;
    private int stockActual;
    private Medicamento medicamento; // Relación con Medicamento

    public DetalleMedicamento(int idDetalleMedicamento, String nroLote, Date fechaVencimiento, int stockActual, Medicamento medicamento) {
        this.idDetalleMedicamento = idDetalleMedicamento;
        this.nroLote = nroLote;
        this.fechaVencimiento = fechaVencimiento;
        this.stockActual = stockActual;
        this.medicamento = medicamento;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Lote: " + nroLote + " | Medicamento: " + medicamento.getNombre() + " | Stock Lote: " + stockActual);
    }

    public int getIdDetalleMedicamento() { return idDetalleMedicamento; }
    public int getStockActual() { return stockActual; }
    public Medicamento getMedicamento() { return medicamento; }
}
