package Ej1;

public abstract class Animal {
    protected String nombre;
    protected int edad;
    protected String tipoAnimal;
    protected double precio;

    public Animal(String nombre, int edad, String tipoAnimal, double precio) {
        this.nombre = nombre;
        this.edad = edad;
        this.tipoAnimal = tipoAnimal;
        this.precio = precio;
    }

    public abstract void alimentar();

    @java.lang.Override
    public String toString() {
        return "Animal" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", tipoAnimal='" + tipoAnimal + '\'' +
                ", precio=" + precio;
    }
}
