package Ej10;

public class LibroTextoUniversidadColombia extends LibroDeTexto {
    private String Universidad;

    public LibroTextoUniversidadColombia(String titulo, String autor, float precio, String cursoAsociado, String universidad) {
        super(titulo, autor, precio, cursoAsociado);
        Universidad = universidad;
    }

    @Override
    public void imprimirPantalla() {
        System.out.println("Titulo:" + titulo + "\nAutor: " + autor + "\nPrecio: " + precio + "\nCurso asociado: " + cursoAsociado + "\nUniversidad: " + Universidad);
    }
}
