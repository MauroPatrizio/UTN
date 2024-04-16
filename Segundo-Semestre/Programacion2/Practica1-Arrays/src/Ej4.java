import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ej4 {
    public static void main(String[] args) {
        //Leer 10 números enteros, almacenarlos en un arreglo y determinar en qué posiciones se encuentran los números terminados en 4.
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[10];
        for (int i = 0; i < 10; i++) {
            System.out.println("Ingrese un número entero (" + i+1 + "/10)");
            array[i] = scanner.nextInt();
        }

        List<Integer> indices = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            if (array[i] % 10 == 4){
                indices.add(i);
            }
        }

        if(indices.size()>0){
            System.out.println("Los números terminados en 4 se encuentran en las posiciones: ");
            for (int posicion : indices){
                System.out.println(posicion);
            }
        } else {
            System.out.println("No hay números terminados en 4 en este array");
        }

    }
}
