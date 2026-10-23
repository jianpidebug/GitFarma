package herencia;

public class Cliente extends Persona {

    private int idCliente;
    private String telefono;

    public Cliente(int idCliente, String nombre, String apellido, String dni, String telefono) {
        super(nombre, apellido, dni);
        this.idCliente = idCliente;
        this.telefono = telefono;
    }

    void solicitarMedicamento(String medicamento) {
        System.out.println(nombre + " solicita " + medicamento);
    }

    void presentarReceta(String medicamento) {
        System.out.println(nombre + " presenta la receta de " + medicamento);
    }

    void realizarPago(double monto) {
        System.out.println(nombre + " paga S/ " + monto);
    }

    void actualizarTelefono(String nuevoTelefono) {
        telefono = nuevoTelefono;
    }

    @Override
    void printStates() {
        System.out.println("idCliente:" + idCliente +
                           " nombre:" + nombre +
                           " apellido:" + apellido +
                           " dni:" + dni +
                           " telefono:" + telefono);
    }
}