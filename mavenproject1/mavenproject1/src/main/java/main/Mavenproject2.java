package main;

import modelo.Boleta;
import modelo.Categoria;
import modelo.Cliente;
import modelo.DetalleMedicamento;
import modelo.Empleado;
import modelo.Medicamento;
import modelo.TipoContrato;
import modelo.Venta;
import java.util.Date;

public class Mavenproject2 {

    public static void main(String[] args) {
        System.out.println("=== SISTEMA DE FARMACIA ===");

        // 1. Datos iniciales
        TipoContrato contrato1 = new TipoContrato(1, "Tiempo Completo");
        Empleado qf = new Empleado(1, "73829102", "Carlos", "Pérez", "Químico Farmacéutico", "QF-9942", "cperez", "123", contrato1);
        Cliente cli1 = new Cliente(1, "45678912", "Ana", "Gómez", "987654321");
        
        Categoria cat1 = new Categoria(1, "Antibióticos");
        Medicamento med1 = new Medicamento(1, "Amoxicilina 500mg", cat1, 15.00, 50);
        DetalleMedicamento lote1 = new DetalleMedicamento(1, "LOTE-2026-A", new Date(), 50, med1);

        // 2. Transacciones
        Venta venta1 = new Venta(1, new Date(), 30.00, "Tarjeta", "Pagado", "POS-001", qf, cli1);
        
        // Aquí pasamos los 6 argumentos: id, serie, numero, fecha, total, idVenta
        Boleta boleta1 = new Boleta(1, "B001", "000123", new Date(), 30.00, venta1.getIdVenta());

        // 3. Mostrar resultados
        System.out.println("\n--- DETALLES ---");
        qf.mostrarDetalles();
        cli1.mostrarDetalles();
        lote1.mostrarDetalles();
        venta1.mostrarDetalles();
        boleta1.mostrarDetalles();

        System.out.println("\n--- ESTADÍSTICAS ESTÁTICAS ---");
        System.out.println("Empleados registrados: " + Empleado.getContadorEmpleados());
    }
}