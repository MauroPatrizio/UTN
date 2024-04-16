import java.util.Scanner;

public class Ej2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //2. Leer 10 enteros, almacenarlos en un arreglo y determinar en qué posición del arreglo está el mayor número primo leído.
        int[] array = new int[10];
        for (int i = 0; i < 10; i++) {
            System.out.println("Ingrese un número entero (" + i+1 + ")");
            array[i] = scanner.nextInt();
        }


        int mayorPrimo = Integer.parseInt(null);
        int indiceMayorPrimo = Integer.parseInt(null);
        for (int i = 0; i < 10; i++) {
            if(esPrimo(array[i]) && array[i] > mayorPrimo){
                mayorPrimo = array[i];
                indiceMayorPrimo = i;
            }
        }

        System.out.println("El mayor número primo es " + mayorPrimo+ " y encuentra en la posición " + indiceMayorPrimo);
    }

    public static boolean esPrimo(int num){
        if (num < 2){
            return false;
        } else if (num <= 3){
            return true;
        } else if(num%2 == 0 || num%3==0){
            return false;
        } else{
            return true;
        }
    }
}
