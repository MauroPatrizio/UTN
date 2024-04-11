import Ej10.Libro;
import Ej10.LibroTextoUniversidadColombia;
import Ej10.Novela;
import Ej10.TipoNovela;
import Ej8.Empleado;
import Ej8.Gerente;
import Ej8.Trabajador;
import Ej9.Circulo;
import Ej9.Rectangulo;

public class Main {
    public static void main(String[] args) {
        //Ejercicio 8

        Gerente gerente1 = new Gerente("Marcos",21, 1500, "Ventas");
        Trabajador trabajador1 = new Trabajador("Mirta", 32, 1200, "Ventas");

        gerente1.organizarActividad();
        trabajador1.producir();

        //Ejercicio 9

        Circulo circulo1 = new Circulo(32.1F);
        Rectangulo rectangulo1 = new Rectangulo(10, 15.2F);

        System.out.println(rectangulo1.area());
        System.out.println(rectangulo1.perimetro());
        System.out.println(circulo1.area());
        System.out.println(circulo1.perimetro());

        //Ejercicio 10

        Libro librouniversidad = new LibroTextoUniversidadColombia("Programación en Python", "Rigoni", 15.5F, "Curso3", "UTN");
        Libro novela1 = new Novela("20000 leguas de viaje submarino", "Verne", 18F, TipoNovela.AVENTURA);
        librouniversidad.imprimirPantalla();
        novela1.imprimirPantalla();
    }
}