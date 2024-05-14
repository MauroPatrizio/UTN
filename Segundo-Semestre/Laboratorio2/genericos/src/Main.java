import Ej3.Almacen;
import Ej3.Producto;
import Ej4.*;

public class Main {
    public static void main(String[] args) {
        //Ej1
        Calculadora<Integer> calculadora = new Calculadora();

        System.out.println("Suma: " + calculadora.suma(7, 3)); // Salida: Suma: 8
        System.out.println("Resta: " + calculadora.resta(15, 9)); // Salida: Resta: 2
        System.out.println("Producto: " + calculadora.multiplicacion(23, 4)); // Salida: Producto: 15
        System.out.println("División: " + calculadora.division(17, 2)); // Salida: División: 5
        System.out.println("División por cero: " + calculadora.division(10, 0)); // Salida: Error: No se puede dividir por cero, División por cero: null

        //Ej2
        PilaArray<Integer> pila = new PilaArray<>(7);

        pila.add(4);
        pila.add(3);
        pila.add(2);
        pila.add(1);

        System.out.println(pila);
        System.out.println("Primer elemento: " + pila.first());
        System.out.println("Elemento removido " + pila.remove());
        System.out.println(pila);

        //Ej3
        Ej3.Almacen almacen = new Ej3.Almacen();

        Ej3.Producto producto1 = new Ej3.Producto("Gaseosa", 2000);
        Ej3.Producto producto2 = new Ej3.Producto("Galletas", 1500);
        Ej3.Producto producto3 = new Ej3.Producto("Azucar", 1000);

        almacen.imprimirProductos();
    }

}