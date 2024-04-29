package Ej2;

public class Empleado {
    private String nombre;
    private Empleado supervisor;

    public Empleado(String nombre) {
        this.nombre = nombre;
    }

    public void asignarSupervisor(Empleado supervisor){
        this.supervisor = supervisor;
    }

    public String obtenerNombreSupervisor(){
        if (supervisor != null){
            return supervisor.nombre;
        } else {
            return "Sin supervisor";
        }
    }
}
