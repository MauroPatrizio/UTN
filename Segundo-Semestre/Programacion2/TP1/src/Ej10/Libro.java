package Ej10;

public abstract class Libro {
    protected String titulo, autor;
    protected float precio;

    public Libro(String titulo, String autor, float precio) {
        this.titulo = titulo;
        this.autor = autor;
        this.precio = precio;
    }

    public void imprimirPantalla(){
        System.out.println("Titulo:" + titulo + "\nAutor: " + autor + "\nPrecio: " + precio);
    }
}
