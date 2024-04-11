package Ej10;

public abstract class LibroDeTexto extends Libro{
    protected String cursoAsociado;

    public LibroDeTexto(String titulo, String autor, float precio, String cursoAsociado) {
        super(titulo, autor, precio);
        this.cursoAsociado = cursoAsociado;
    }

}
