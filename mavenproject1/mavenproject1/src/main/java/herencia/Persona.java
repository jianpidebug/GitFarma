package herencia;

public class Persona {

    protected String nombre;
    protected String apellido;
    protected String dni;

    public Persona(String nombre, String apellido, String dni) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
    }

    void printStates() {
        System.out.println("nombre:" + nombre +
            " apellido:" + apellido +
            " dni:" + dni);
    }
}