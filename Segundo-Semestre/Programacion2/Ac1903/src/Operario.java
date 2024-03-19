public class Operario extends Empleado {
    protected int dni;

    public Operario(String nombre, int dni) {
        super(nombre);
        this.dni = dni;
    }

    public void operaciones(){
        System.out.println("El operario trabaja en el depósito");
    }

    @Override
    public String toString() {
        return "Operario{" +
                "dni=" + dni +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}
