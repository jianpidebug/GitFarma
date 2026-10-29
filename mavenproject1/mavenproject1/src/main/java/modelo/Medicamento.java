package modelo;

import interfaces.Auditable;
import modelo.Categoria;

public class Medicamento implements Auditable {
    private int idMedicamento;
    private String nombre;
    private Categoria categoria;
    private double precio;
    private int stock;

    public Medicamento(int idMedicamento, String nombre, Categoria categoria, double precio, int stock) {
        this.idMedicamento = idMedicamento;
        this.nombre = nombre;
        this.categoria = categoria;
        this.precio = precio;
        this.stock = stock;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Medicamento: " + nombre + " | Categoría: " + categoria.getNombre() + 
                           " | Precio: $" + precio + " | Stock: " + stock);
    }

    // Método getNombre necesario para DetalleMedicamento
    public String getNombre() { 
        return nombre; 
    }

    public int getIdMedicamento() { return idMedicamento; }
    public Categoria getCategoria() { return categoria; }
    public double getPrecio() { return precio; }
    public int getStock() { return stock; }
}