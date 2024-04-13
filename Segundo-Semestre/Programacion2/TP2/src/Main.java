import Ej1.*;
import Ej2.*;

public class Main {
    public static void main(String[] args) {

        //Ej1
        TiendaMascotas tienda = new TiendaMascotas();

        tienda.addAnimal(new Perro("Firulais", 3, "Canino", 150, "Border Collie", true));
        tienda.addAnimal(new Gato("Michi", 2, "Felino", 120, "Ragdoll", false));
        tienda.addAnimal(new Ave("Polly", 1, "Ave", 50, "Loro", true));
        tienda.addAnimal(new Pez("Nemo", 1, "Pez", 10, "Payaso"));

        tienda.listarAnimales();
        tienda.venderAnimal("Firulais");
        tienda.alimentarAnimal("Michi");
        tienda.listarAnimales();

        //Ej2
        Biblioteca biblioteca = new Biblioteca();

        Libro libroNovela = new Novela("Cien años de soledad", "Gabriel García Márquez", 1967, false, "Romance");
        Libro libroUniversitario = new Universitario("Introducción a la programación", "John Doe", 2020, true, "Ingeniería");
        Libro libroInfantil = new Infantil("El principito", "Antoine de Saint-Exupéry", 1943, true, 5);

        biblioteca.agregarLibro(libroNovela);
        biblioteca.agregarLibro(libroUniversitario);
        biblioteca.agregarLibro(libroInfantil);

        biblioteca.listarLibrosDisponibles();

        biblioteca.prestarLibro("El principito");
        biblioteca.listarLibrosDisponibles();

        biblioteca.prestarLibro("El principito");

        biblioteca.devolverLibro("El principito");
        biblioteca.listarLibrosDisponibles();

        biblioteca.devolverLibro("Don Quijote");
    }
}