package com.mycompany.mavenproject1;

/**
 *
 * @author USER
 */
public class Main {

    public static void main(String[] args) {
        Cliente cliente = new Cliente(1, "Mika", "Pérez", "12345678", "999888777");
        QuimicoFarmaceutico qf = new QuimicoFarmaceutico(1, "Carlos", "Ramírez", "87654321", "CQFP-4521", "Mañana");

        cliente.printStates();
        qf.printStates();

        cliente.solicitarMedicamento("Amoxicilina");
        cliente.presentarReceta("Amoxicilina");
        qf.validarReceta("Amoxicilina");
        qf.orientarCliente("Amoxicilina");
        qf.dispensarMedicamento("Amoxicilina");
        cliente.realizarPago(16.00);
        qf.emitirComprobante(16.00);
    }
}