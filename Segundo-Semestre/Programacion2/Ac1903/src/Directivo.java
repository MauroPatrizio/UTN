public class Directivo extends Empleado {

    protected int dni;

    public Directivo(String nombre, int dni) {
        super(nombre);
        this.dni = dni;
    }

    public void decisiones(){
        System.out.println("El directivo está tomando decisiones sobre la empresa");
    }
    @Override
    public String toString() {
        return "Directivo{" +
                "nombre='" + nombre + '\'' +
                '}';
    }
}
