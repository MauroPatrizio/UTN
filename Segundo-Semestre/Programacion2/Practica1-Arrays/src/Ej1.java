import java.util.Scanner;

public class Ej1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Ej1
        //1.	Leer 10 enteros, almacenarlos en un arreglo y determinar en qué posición del arreglo está el mayor número leído.

        int[] array = new int[10];
        for (int i = 0; i < 10; i++) {
            System.out.println("Ingrese un número entero (" + i+1 + "/10)");
            array[i] = scanner.nextInt();
        }

        int mayor = array[0];
        for (int numero : array){
            if (numero > mayor){
                mayor = numero;
            }
        }

        System.out.println("El número mayor es " + mayor);
    }
}