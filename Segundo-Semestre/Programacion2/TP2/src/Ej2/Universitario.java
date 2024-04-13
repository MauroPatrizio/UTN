package Ej2;

public class Universitario extends Libro{
    private String carrera;

    public Universitario(String titulo, String autor, int añoDePublicacion, boolean prestado, String carrera) {
        super(titulo, autor, añoDePublicacion, prestado);
        this.carrera = carrera;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }
}
