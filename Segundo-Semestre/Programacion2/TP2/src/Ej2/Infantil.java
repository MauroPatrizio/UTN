package Ej2;

public class Infantil extends Libro{
    private int edadRecomendada;

    public Infantil(String titulo, String autor, int añoDePublicacion, boolean prestado, int edadRecomendada) {
        super(titulo, autor, añoDePublicacion, prestado);
        this.edadRecomendada = edadRecomendada;
    }

    public int getEdadRecomendada() {
        return edadRecomendada;
    }

    public void setEdadRecomendada(int edadRecomendada) {
        this.edadRecomendada = edadRecomendada;
    }
}
