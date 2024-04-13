package Ej2;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca{
    private List<Libro> libros;

    public Biblioteca() {
        this.libros = new ArrayList<>();
    }

    public  void agregarLibro(Libro libro){
        libros.add(libro);
    }

    public void listarLibrosDisponibles() {
        System.out.println("Lista de libros disponibles:");
        for (Libro libro : libros) {
            if (!libro.prestado) {
                System.out.println(libro.titulo);
            }
        }
    }

    public void listaDeLibrosDisponibles(){
        for (Libro libro : libros){
            if (!libro.prestado){
                System.out.println(libro.titulo);
            }
        }
    }

    public void prestarLibro(String titulo) {
        for (Libro libro : libros) {
            if (libro.titulo.equals(titulo)) {
                System.out.println("El libro " + titulo + " ha sido prestado");
                libro.prestar();
                return;
            }
        }
        System.out.println("El libro " + titulo + " no está disponible para prestar en este momento");
    }

    public void devolverLibro(String titulo) {
        for (Libro libro : libros) {
            if (libro.titulo.equals(titulo)) {
                System.out.println("El libro " + titulo + " ha sido devuelto");
                libro.devolver();
                return;
            }
        }
        System.out.println("El libro " + titulo + " sigue en inventario, por lo tanto no es de esta biblioteca");
    }
}
