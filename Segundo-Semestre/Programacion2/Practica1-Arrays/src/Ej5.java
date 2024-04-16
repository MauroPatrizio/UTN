import java.util.Scanner;

public class Ej5 {
    public static void main(String[] args) {

        //Leer 10 números enteros, almacenarlos en un arreglo y determinar cuántas veces está repetido el mayor

        Scanner scanner = new Scanner(System.in);
        int[] array = new int[10];
        for (int i = 0; i < 10; i++) {
            System.out.println("Ingrese un número entero (" + i+1 + "/10)");
            array[i] = scanner.nextInt();
        }
        int mayor = Integer.parseInt(null);
        int repeticiones = 0;

        for (int i = 0; i < 10; i++) {
            if(array[i] > mayor){
                mayor = array[i];
            }
        }

        for (int i = 0; i < 10; i++) {
            if(array[i] == mayor){
                repeticiones++;
            }
        }

        System.out.println("El número mayor es " + mayor + " y está repetido " + repeticiones + "veces");
    }
}
