import com.sun.source.tree.WhileLoopTree;

import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int opcion;

        do{
            System.out.println("Ingrese el número de ejercicio (1-29) o ingrese 0 para salir: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1 -> ejercicio1();
                case 2 -> ejercicio2();
                case 3 -> ejercicio3();
                case 4 -> ejercicio4();
                case 5 -> ejercicio5();
                case 6 -> ejercicio6();
                case 7 -> ejercicio7();
                case 8 -> ejercicio8();
                case 9 -> ejercicio9();
                case 10 -> ejercicio10();
                case 11 -> ejercicio11();
                case 12 -> ejercicio12();
                case 13 -> ejercicio13();
                case 14 -> ejercicio14();
                case 15 -> ejercicio15();
                case 16 -> ejercicio16();
                case 17 -> ejercicio17();
                case 18 -> ejercicio18();
                case 19 -> ejercicio19();
                case 20 -> ejercicio20();
                case 21 -> ejercicio21();
                case 22 -> ejercicio22();
                case 23 -> ejercicio23();
                case 24 -> ejercicio24();
                case 25 -> ejercicio25();
                case 26 -> ejercicio26();
                case 27 -> ejercicio27();
                case 28 -> ejercicio28();
                case 29 -> ejercicio29();

                case 0 -> System.out.println("Saliendo del programa.");
                default -> System.out.println("Opción no válida. Por favor, elija una opción válida.");
            }
        } while (opcion != 0);
    }

    public static void ejercicio1(){
        System.out.println("Escriba un número entero: ");
        int num = scanner.nextInt();
        System.out.println(num%2==0 ? "Es par": "Es impar");
    }

    public static void ejercicio2(){
        System.out.println("Escriba un número entero: ");
        int num = scanner.nextInt();
        System.out.println(num%10==0 ? "Es múltiplo de 10": "No es múltiplo de 10");
    }

    public static void ejercicio3(){
        System.out.println("Ingrese una letra: ");
        char letra = scanner.next().charAt(0);
        System.out.println(Character.isUpperCase(letra)? "La letra ingresada es mayúculoa": "La letra ingresada no es mayúscula");
    }

    public static void ejercicio4(){
        System.out.println("Ingrese el primer número entero: ");
        int num1 = scanner.nextInt();
        System.out.println("Ingrese el primer número entero: ");
        int num2 = scanner.nextInt();
        System.out.println(num1 == num2 ? "Los números ingresados son iguales" : "Los números ingresados no son iguales");
    }

    public static void ejercicio5(){
        System.out.println("Ingrese el primer número entero: ");
        int num1 = scanner.nextInt();
        System.out.println("Ingrese el primer número entero: ");
        int num2 = scanner.nextInt();
        System.out.printf("El número mayor es %d %n", Math.max(num1, num2));
    }

    public static void ejercicio6(){
        System.out.println("Ingrese el primer número entero: ");
        int num1 = scanner.nextInt();
        System.out.println("Ingrese el primer número entero: ");
        int num2 = scanner.nextInt();
        System.out.println(num1%10 == num2%10 ?
                "La última cifra de ambos números es la misma" : "La última cifra de ambos números es diferente");
    }

    public static void ejercicio7(){
        System.out.println("Ingrese el primer número entero: ");
        int num = scanner.nextInt();
        System.out.println(num%15==0 ? "El número es múltiplo de 3 y de 5" : "El número no es múltiplo de 3 y de 5");
    }

    public static void ejercicio8(){
        System.out.println("Ingrese el primer número entero: ");
        int num = scanner.nextInt();
        System.out.println(num%6==0 ? "El número es múltiplo de 2 y de 3" : "El número no es múltiplo de 2 y de 3");
    }

    public static void ejercicio9(){
        System.out.println("Ingrese el primer caracter: ");
        char car1 = scanner.next().charAt(0);
        System.out.println("Ingrese el segundo caracter: ");
        char car2 = scanner.next().charAt(0);
        System.out.println(car1==car2 ? "Los caracteres son iguales" : "Los caracteres no son igules");
    }

    public static void ejercicio10(){
        System.out.println("Ingrese el primer caracter: ");
        char car1 = scanner.next().charAt(0);
        System.out.println("Ingrese el segundo caracter: ");
        char car2 = scanner.next().charAt(0);
        System.out.println(Character.isLowerCase(car1) && Character.isLowerCase(car2) ? "Los caracteres son minúsculas" : "Los caracteres no son minúsculas");
    }
    public static void ejercicio11(){
        System.out.println("Ingrese un caracter: ");
        char car = scanner.next().charAt(0);
        System.out.println(Character.isDigit(car)? "El caracter es un dígito" : "El caracter no es un dígito");
    }

    public static void ejercicio12(){
        System.out.println("Ingrese el dividendo: ");
        int num1 = scanner.nextInt();
        while(true) {
            System.out.println("Ingrese el divisor: ");
            int num2 = scanner.nextInt();
            if(num2==0){
                System.out.println("No se puede dividir por 0");
                break;
            } else {
                System.out.println("El resultado de la division es: " + (num1/num2));
            }
        }
    }

    public static void ejercicio13(){
        System.out.print("Ingrese un año: ");
        int year = scanner.nextInt();
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " es un año bisiesto.");
        } else {
            System.out.println(year + " no es un año bisiesto.");
        }
    }

    public static void ejercicio14() {
        while (true) {
            System.out.println("Ingrese un número entero de 3 cifras: ");
            String num = scanner.next();
            if(num.length()!=3){
                System.out.println("El número debe ser de 3 cifras");
            } else {
                System.out.println(num.charAt(0) == num.charAt(2) ?
                        "Es un número capicúa" : "No es un número capicúa");
                break;
            }
        }
    }

    public static void ejercicio15(){
        System.out.println("Ingrese la hora");
        int H = scanner.nextInt();
        System.out.println("Ingrese los minutos");
        int M = scanner.nextInt();
        System.out.println("Ingrese los segundos");
        int S = scanner.nextInt();

        System.out.println((H >= 0 && H < 24) &&
                (M >= 0 && M < 60) &&
                (S >= 0 && S < 60) ?
                "La H es válida" : "La H es inválida");
    }

    public static void ejercicio16(){
        while(true) {
            System.out.println("Ingrese el número de mes (1-12): ");
            int mes = scanner.nextInt();
            if (mes<1 || mes > 12){
                System.out.println("El número de mes es inválido");
            } else {
                switch (mes){
                    case 2:
                        System.out.println("El mes tiene 28 días");
                        break;
                    case 4,6,9,11:
                        System.out.println("El mes tiene 30 días");
                        break;
                    default:
                        System.out.println("El mes tiene 31 días");
                        break;
                }
                break;
            }
        }
    }

    public static void ejercicio17(){
        boolean cond = true;
        while (cond) {
        System.out.println("Ingrese la calificación (0-10): ");
        int nota = scanner.nextInt();
            switch (nota) {
                case 1, 2, 3, 4:
                    System.out.println("Insuficiente");
                    cond = false;
                    break;
                case 5:
                    System.out.println("Suficiente");
                    cond = false;
                    break;
                case 6:
                    System.out.println("Bien");
                    cond = false;
                    break;
                case 7, 8:
                    System.out.println("Notable");
                    cond = false;
                    break;
                case 9, 10:
                    System.out.println("Sobresaliente");
                    cond = false;
                    break;
                default:
                    System.out.println("El dato ingresado es inválido");
                    break;
            }
        }
    }

    public static void ejercicio18(){
        int num = 1;
        while (num <=100){
            System.out.println(num);
            num++;
        }
    }
    public static void ejercicio19(){
        int num = 1;
        do{
            System.out.println(num);
            num++;
        } while (num<101);
    }
    public static void ejercicio20(){
        for (int i = 1; i < 101; i++) {
            System.out.println(i);
        }
    }
    public static void ejercicio21(){
        int num = 100;
        while (num >= 1){
            System.out.println(num);
            num--;
        }
    }
    public static void ejercicio22(){
        int num = 100;
        do{
            System.out.println(num);
            num--;
        } while (num>0);
    }
    public static void ejercicio23(){
        for (int i = 100; i > 0; i--) {
            System.out.println(i);
        }
    }
    public static void ejercicio24(){
        System.out.println("Ingrese un número entero: ");
        int N = scanner.nextInt();

        System.out.println("Estructura for: ");
        for (int i = 1; i <= N; i++) {
            System.out.println(i);
        }

        System.out.println("Estructura while");
        int i = 1;
        while (i <=N){
            System.out.println(i);
            i++;
        }

        System.out.println("Estructura do-while");
        i = 1;
        do{
            System.out.println(i);
            i++;
        } while (i<=N);
    }
    public static void ejercicio25(){
        System.out.println("Ingrese un número entero: ");
        int N = scanner.nextInt();
        int cont = 0;

        System.out.println("Estructura for: ");
        for (int i = N; i > 0; i--) {
            System.out.println(i);
        }

        System.out.println("Estructura while: ");
        while ((N-cont) >= 1){
            System.out.println(N-cont);
            cont++;
        }

        System.out.println("Estructura do-while");
        do{
            System.out.println(N);
            N--;
        } while (N>0);
    }

    public static void ejercicio26(){
        boolean opt = true;
        while(opt){
            System.out.println("Ingrese el primer número entero: ");
            int num1 = scanner.nextInt();
            System.out.println("Ingrese el segundo número entero: ");
            int num2 = scanner.nextInt();

            if (num1== num2){
                System.out.println("Los números deben ser distintos");
            } else {
                for (int i = Math.min(num1, num2) ; i <= Math.max(num1,num2) ; i++) {
                    System.out.println(i);
                }
                opt = false;
            }
        }
    }

    public static void ejercicio27(){
        boolean opt = true;
        while(opt){
            System.out.println("Ingrese el primer número entero: ");
            int A = scanner.nextInt();
            System.out.println("Ingrese el segundo número entero: ");
            int B = scanner.nextInt();

            if (A >= B){
                System.out.println("El primer número debe ser menor al segundo");
            } else {
                for (int i = A ; i <= B ; i++) {
                    if (i%2!=0){
                        System.out.println(i);
                    }
                }
                opt = false;
            }
        }
    }

    public static void ejercicio28(){
        boolean opt = true;
        while(opt){
            System.out.println("Ingrese el múltiplo: ");
            int N = scanner.nextInt();
            System.out.println("Ingrese el número hasta el cual llegar: ");
            int M = scanner.nextInt();

            if (N >= M){
                System.out.println("El valor del múltiplo debe ser menor al del número");
            } else {
                for (int i = 1 ; i <= M ; i++) {
                    if (i%4==0){
                        System.out.println(i);
                    }
                }
                opt = false;
            }
        }
    }

    public static void ejercicio29(){
        boolean opt = true;
        while (opt) {
            System.out.println("Ingrese la cantidad de millas (0 para salir): ");
            double millas = scanner.nextDouble();
            if (millas == 0){
                System.out.println("Saliendo");
                break;
            } else {
                double km = millas*1.6093;
                System.out.printf("%.2f millas son %.2f km %n", millas, km);
            }
        }
    }
}