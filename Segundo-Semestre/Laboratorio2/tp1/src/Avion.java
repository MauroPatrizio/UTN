public class Avion implements Volador{
    private  int year;
    private float capacidad;
    private String modelo;

    public Avion(int year, float capacidad, String modelo) {
        this.year = year;
        this.capacidad = capacidad;
        this.modelo = modelo;
    }


    @Override
    public void Volar() {
        System.out.println("El avion esta despegando para realizar su vuelo ");
    }
}
