public class Tecnico extends Operario {
    protected int idOficial;

    public Tecnico(String nombre, int dni, int idOficial) {
        super(nombre, dni);
        this.idOficial = idOficial;
    }

    public static void manejo(){
        System.out.println("El técnico hace el manejo de material dentro del depósito");
    }

    @Override
    public String toString() {
        return "Tecnico{" +
                "idOficial=" + idOficial +
                ", dni=" + dni +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}
