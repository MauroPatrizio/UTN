import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ej3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //3. Almacenar en un arreglo de 10 posiciones los 10 números primos comprendidos entre 100 y 300. Luego mostrarlos en pantalla.
        List<Integer> array = new ArrayList<>();

        for (int i = 100; i < 300; i++) {
            if (esPrimo(i) && array.size() < 10){
                array.add(i);
            }
        }

        System.out.println("Los primeros 10 números primos comprendidos entre 100 y 300 son: ");
        for (Integer num : array){
            System.out.println(num);
        }
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
