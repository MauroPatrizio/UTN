package Ej8;

public abstract class Empleado {
    protected String nombre;
    protected int edad;
    protected float salario;

    public Empleado(String nombre, int edad, float salario) {
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;
    }
}
