import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String option;
        do {

            System.out.println("Ingrese + para sumar\nIngrese - para restar\nIngrese * para multiplicar\nIngrese / para dividir\nIngrese x para salir\nElija su opción: ");
            option = scanner.next().toLowerCase();
            System.out.println("Ingrese el primer número: ");
            double num1 = scanner.nextDouble();
            System.out.println("Ingrese el numero a multiplicar: ");
            double num2 = scanner.nextDouble();


            switch (option) {
                case "+":
                    System.out.println(num1 + num2);
                    break;
                case "-":
                    System.out.println(num1 - num2);
                    break;
                case "*":
                    System.out.println(num1 * num2);
                    break;
                case "/":
                    if (num2 == 0) {
                        System.out.println("No se puede dividir por 0");
                        break;
                    } else {
                        System.out.println(num1 / num2);
                        break;
                    }
                case "x":
                    System.out.println("Cerrando programa, adios!");
                default:
                    System.out.println("El valor ingresado es incorrecto");
            }
        } while (!option.equals("x"));
    }
}
