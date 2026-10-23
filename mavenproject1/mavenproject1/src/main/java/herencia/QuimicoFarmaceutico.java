package herencia;

public class QuimicoFarmaceutico extends Persona {

    private int idQuimico;
    private String nroColegiatura;
    private String turno;

    public QuimicoFarmaceutico(int idQuimico, String nombre, String apellido, String dni,
                               String nroColegiatura, String turno) {
        super(nombre, apellido, dni);
        this.idQuimico = idQuimico;
        this.nroColegiatura = nroColegiatura;
        this.turno = turno;
    }

    void validarReceta(String medicamento) {
        System.out.println("QF " + nombre + " valida la receta de " + medicamento);
    }

    void dispensarMedicamento(String medicamento) {
        System.out.println("QF " + nombre + " entrega " + medicamento);
    }

    void orientarCliente(String medicamento) {
        System.out.println("QF " + nombre + " explica dosis y uso de " + medicamento);
    }

    void emitirComprobante(double monto) {
        System.out.println("QF " + nombre + " emite comprobante por S/ " + monto);
    }

    void cambiarTurno(String nuevoTurno) {
        turno = nuevoTurno;
    }

    @Override
    void printStates() {
        System.out.println("idQuimico:" + idQuimico +
                           " nombre:" + nombre +
                           " apellido:" + apellido +
                           " dni:" + dni +
                           " nroColegiatura:" + nroColegiatura +
                           " turno:" + turno);
    }
}