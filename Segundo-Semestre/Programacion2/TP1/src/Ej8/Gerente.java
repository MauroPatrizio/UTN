package Ej8;

public class Gerente extends Empleado{
    private String departamento;

    public Gerente(String nombre, int edad, float salario, String departamento) {
        super(nombre, edad, salario);
        this.departamento = departamento;
    }

    public void organizarActividad(){
        System.out.println("El gerente organizó una actividad en el departamento " + departamento);
    }
}
