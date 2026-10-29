package modelo;

import java.util.Date;

public class Receta {
    private int idReceta;
    private String nombreMedico;
    private String nroColegiaturaMedico;
    private Date fechaEmision;
    private int idVenta;
    private Empleado empleadoQF; // El QF que valida la receta

    public Receta(int idReceta, String nombreMedico, String nroColegiaturaMedico, Date fechaEmision, int idVenta, Empleado empleadoQF) {
        this.idReceta = idReceta;
        this.nombreMedico = nombreMedico;
        this.nroColegiaturaMedico = nroColegiaturaMedico;
        this.fechaEmision = fechaEmision;
        this.idVenta = idVenta;
        this.empleadoQF = empleadoQF;
    }

    public String getNombreMedico() { return nombreMedico; }
    public Empleado getEmpleadoQF() { return empleadoQF; }
}