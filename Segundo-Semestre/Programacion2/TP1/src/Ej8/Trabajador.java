package Ej8;

public class Trabajador extends Empleado{
    private String area;

    public Trabajador(String nombre, int edad, float salario, String area) {
        super(nombre, edad, salario);
        this.area = area;
    }

    public void producir(){
        System.out.println("El trabajador produce en el area " + area);
    }
}
