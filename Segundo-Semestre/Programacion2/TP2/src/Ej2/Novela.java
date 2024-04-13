package Ej2;

public class Novela extends Libro{
    private String genero;

    public Novela(String titulo, String autor, int añoDePublicacion, boolean prestado, String genero) {
        super(titulo, autor, añoDePublicacion, prestado);
        this.genero = genero;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
}
