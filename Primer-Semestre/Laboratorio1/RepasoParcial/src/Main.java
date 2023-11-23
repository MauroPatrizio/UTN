import java.util.Scanner;

public class Main {g
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el primer número entero: ");
        int num1 = scanner.nextInt();
        System.out.println("Ingrese el segundo número entero: ");
        int num2 = scanner.nextInt();

        if(num1%10 == num2%10){
            System.out.println("La última cifra de ambos números es igual");
        } else {
            System.out.println("La última cifra de ambos números no es igual");
        }
    }
}