package interfast;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Cliente cliente = new Cliente(1, "Mika", "Pérez", "12345678", "999888777");
        QuimicoFarmaceutico qf = new QuimicoFarmaceutico(1, "Carlos", "Ramírez", "87654321", "CQFP-4521", "Mañana");

        // Lista que acepta cualquiera que firmó AtencionFarmacia
        List<AtencionFarmacia> atenciones = new ArrayList<>();
        atenciones.add(cliente);
        atenciones.add(qf);

        // Misma orden para todos, sin importar el tipo
        for (AtencionFarmacia a : atenciones) {
            a.iniciarAtencion();
            a.mostrarEstado();
            a.finalizarAtencion();
        }

        // Métodos propios de cada uno (no están en la interfaz)
        cliente.presentarReceta("Amoxicilina");
        qf.dispensarMedicamento("Amoxicilina");
        cliente.realizarPago(16.00);
        qf.emitirComprobante(16.00);
    }
}