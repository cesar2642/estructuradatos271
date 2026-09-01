package org.example;

public class Empleado {
    private int numeroTrabajador;
    private String nombre;
    private String paterno;
    private String materno;
    private int horasExtra;
    private double sueldoBase;
    private int anioIngreso;


    public Empleado() {
    }

    public Empleado(int numeroTrabajador, String nombre, String paterno, String materno, int horasExtra, double sueldoBase, int anioIngreso) {
        this.numeroTrabajador = numeroTrabajador;
        this.nombre = nombre;
        this.paterno = paterno;
        this.materno = materno;
        this.horasExtra = horasExtra;
        this.sueldoBase = sueldoBase;
        this.anioIngreso = anioIngreso;
    }

    public int getNumeroTrabajador() {
        return numeroTrabajador;
    }

    public void setNumeroTrabajador(int numeroTrabajador) {
        this.numeroTrabajador = numeroTrabajador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPaterno() {
        return paterno;
    }

    public void setPaterno(String paterno) {
        this.paterno = paterno;
    }

    public String getMaterno() {
        return materno;
    }

    public void setMaterno(String materno) {
        this.materno = materno;
    }

    public int getHorasExtra() {
        return horasExtra;
    }

    public void setHorasExtra(int horasExtra) {
        this.horasExtra = horasExtra;
    }

    public double getSueldoBase() {
        return sueldoBase;
    }

    public void setSueldoBase(double sueldoBase) {
        this.sueldoBase = sueldoBase;
    }

    public int getAnioIngreso() {
        return anioIngreso;
    }

    public void setAnioIngreso(int anioIngreso) {
        this.anioIngreso = anioIngreso;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "numeroTrabajador=" + numeroTrabajador +
                ", nombre='" + nombre + '\'' +
                ", paterno='" + paterno + '\'' +
                ", materno='" + materno + '\'' +
                ", horasExtra=" + horasExtra +
                ", sueldoBase=" + sueldoBase +
                ", anioIngreso=" + anioIngreso +
                ", sueldo total de este mes=$" + calcularSueldoTotal() +
                '}';
    }

    public double calcularSueldoTotal() {
        int antiguedad = 2026 - this.anioIngreso;
        double prestacion = this.sueldoBase * (antiguedad * 0.03);
        double pagoHorasExtra = this.horasExtra * 276.5;
        return this.sueldoBase + prestacion + pagoHorasExtra;
    }


}
