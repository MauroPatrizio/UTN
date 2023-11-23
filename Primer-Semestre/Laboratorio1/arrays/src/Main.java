import java.util.Scanner;
public class Main {
static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        String opt;
        do {
            System.out.println("Elija el metodo que quiera probar (1-18), Q to quit: ");
            opt = scanner.nextLine().toUpperCase();
            if(!opt.equals("Q")){
                switch (opt) {
                    case "1" -> parte1ej1();
                    case "2" -> parte1ej2();
                    case "3" -> parte1ej3();
                    case "4" -> parte1ej4();
                    case "5" -> parte2ej1();
                    case "6" -> parte2ej2();
                    case "7" -> parte2ej3();
                    case "8" -> parte2ej4();
                    case "9" -> parte3ej1();
                    case "10" -> parte3ej2();
                    case "11" -> parte3ej3();
                    case "12" -> parte3ej4();
                    case "13" -> parte4ej1();
                    case "14" -> parte4ej2();
                    case "15" -> parte4ej3();
                    case "16" -> parte4ej4();
                    case "17" -> parte4ej5();
                    case "18" -> parte4ej6();
                    default -> System.out.println("Opción inválida");
                }
            }
        } while (!opt.equals("Q"));
        System.out.println("Cerrando programa");
    }

    //1. Declarar un array de 10 enteros y inicializarlo con los valores de los 10 primeros números naturales.
    public static void parte1ej1(){
        int[] enteros = new int[10];
        for (int i = 0; i < 10; i++) {
            enteros[i] = i + 1;
        }

    }

    //2. Declarar un array de 10 números reales y inicializarlo con los valores de los 10 primeros números primos.
    public static void parte1ej2(){
        double[] reales = new double[10];
        int cant = 0;
        for (double i: reales) {
            if (i == 2 || i == 3) {
                reales[cant] = i;
                cant++;
            } else if (i % 2 != 0 && i % 3 != 0) {
                reales[cant] = i;
            }
        }
    }

    //3. Declarar un array bidimensional de 10 filas y 10 columnas de números enteros.
    public static void parte1ej3() {
        int[][] bidimensionalEnteros = new int[10][10];
    }

    //4.	Declarar un array multidimensional de 3 dimensiones de números reales.
    public static void parte1ej4() {
        double[][][] tridimensionalReales = new double[10][10][10];
    }

    //Lectura y escritura
    //1. Ingresar por teclado los valores de un array de 10 enteros.
    public static void parte2ej1() {
        int[] integers = new int[10];
        for (int i = 0; i < 10; i++) {
            System.out.println("Ingrese el número para la posición " + i + ":");
            integers[i] = scanner.nextInt();
        }
    }

    //2. Ingresar por teclado los valores de un array de 10 números reales.
    public static void parte2ej2() {
        double[] numeros = new double[10];
        for (int i = 0; i < 10; i++) {
            System.out.println("Ingrese el número para la posición " + i + ":");
            numeros[i] = scanner.nextDouble();
        }
    }

    //3. Leer los datos de un array de caracteres y mostrarlos por pantalla.
    public static void parte2ej3() {
        char[] caracteres = new char[10];
        for (char e : caracteres) {
            System.out.println(e);
        }
    }

    //4.Leer los datos de un array de booleanos y mostrarlos por pantalla
    public static void parte2ej4() {
        boolean[] booleanos = new boolean[10];
        for (boolean b : booleanos) {
            System.out.println(b);
        }
    }

    //operaciones aritmeticas

    //1. Sumar los elementos de un array de 10 enteros.
    public static void parte3ej1() {
        int[] arrayEnteros = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int suma = 0;

        for (int i : arrayEnteros) {
            suma += i;
        }
        System.out.println("La suma de los elementos del array es: " + suma);
    }

    //2. Multiplicar los elementos de un array de 10 números reales.
    public static void parte3ej2() {

        double[] arrayReales = {1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0, 9.0, 10.0};
        double producto = 1.0;

        for (double i : arrayReales) {
            producto *= i;
        }
        System.out.println("El producto de los elementos del array es: " + producto);
    }

    //3. Ordenar un array de 10 enteros de menor a mayor.
    public static void parte3ej3() {

        int[] arrayEnteros = {5, 2, 9, 1, 8, 3, 7, 4, 6, 10};
        Arrays.sort(arrayEnteros);
        System.out.println("Array ordenado de menor a mayor: " + Arrays.toString(arrayEnteros));
    }

    //4. Ordenar un array de 10 cadenas de forma alfabética.
    public static void parte3ej4(){

        String[] arrayStrings = {"coso", "hola", "mundo", "manicomio", "teclado", "botones", "mouse", "pantalla", "billetera", "lentes"};
        Arrays.sort(arrayStrings);
        System.out.println("Array ordenador por orden alfabético");
    }

    //Ejercicios adicionales

    //1. Implementar un método que cuente el número de elementos pares en un array de enteros.
    public static void parte4ej1(){
        int[] arrayEnteros = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int contPares = 0;

        for (int i : arrayEnteros) {
            if (i % 2 == 0) {
                contPares++;
            }
        }
        System.out.println("La cantidad de elementos pares del array es: " + contPares);
    }

    //2. Implementar un método que cuente el número de elementos mayores que 10 en un array de números reales.
    public static void parte4ej2(){
        double[] arrayReales = {5.0, 12.0, 3.0, 15.0, 8.0, 9.0, 7.0, 4.0, 6.0, 10.0};
        int contMayores10 = 0;

        for (double i: arrayReales) {
            if (i > 10.0) {
                contMayores10++;
            }
        }

        System.out.println("Número de elementos mayores que 10 en el array: " + contMayores10);

    }

    //3. Implementar un método que calcule la suma de los elementos de un array de enteros que sean múltiplos de 3.
    public static void parte4ej3(){
        int[] arrayEnteros = {1, 3, 6, 9, 10, 15, 17, 21, 21, 27};
        int sumaMultiplosDe3 = 0;

        for( int i : arrayEnteros){
            if (i%3 == 0){
                sumaMultiplosDe3+=i;
            }
        }
        System.out.println("La suma del los múltiplos de 3 del array es: " + sumaMultiplosDe3);
    }

    //4. Implementar un método que encuentre el elemento máximo de un array de enteros
    public static void parte4ej4(){
        int[] arrayEnteros = {5, 2, 9, 1, 8, 3, 7, 4, 6, 10};

        Arrays.sort(arrayEnteros);

        System.out.println("El elemento máximo del array es: " + arrayEnteros[arrayEnteros.length-1]);
    }

    //5. Implementar un método que encuentre el elemento mínimo de un array de cadenas.
    public static void parte4ej5(){
        String[] arrayStrings = {"coso", "hola", "mundo", "manicomio", "teclado", "botones", "mouse", "pantalla", "billetera", "lentes"};

        Arrays.sort(arrayStrings);

        System.out.println("El elemento mínimo del array es: " + arrayStrings[0]);
    }

    //6. Implementar un método que copie un array de enteros a otro array de enteros.
    public static void parte4ej6(){
        int[] primerArray = {1, 2, 3, 4, 5};
        int[] segundoArray = new int[primerArray.length];

        segundoArray = primerArray.clone();

        System.out.println("El primer array es: " + Arrays.toString(primerArray) + " y el segundo array es: " + Arrays.toString(segundoArray));
    }


}
