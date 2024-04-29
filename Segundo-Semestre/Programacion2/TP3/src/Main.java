import Ej2.Empleado;

public class Main {
    public static void main(String[] args) {
        // Ej 1
        Empleado empleado1 = new Empleado("José");
        Empleado empleado2 = new Empleado("Mario");

        empleado2.asignarSupervisor(empleado1);
        System.out.println(empleado2.obtenerNombreSupervisor());
        System.out.println(empleado1.obtenerNombreSupervisor());

    }
}