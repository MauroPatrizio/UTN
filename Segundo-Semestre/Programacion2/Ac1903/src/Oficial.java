public class Oficial extends Operario {

    protected int idOficial;

    public Oficial(String nombre, int dni, int idOficial) {
        super(nombre, dni);
        this.idOficial = idOficial;
    }

    public void supervisar(){
        System.out.println("El oficial supervisa las acciones del depósito");
    }

    @Override
    public String toString() {
        return "Oficial{" +
                "idOficial=" + idOficial +
                ", dni=" + dni +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}
