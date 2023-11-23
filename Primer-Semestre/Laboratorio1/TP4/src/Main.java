import java.util.*;
import java.util.Random;
import java.util.concurrent.ForkJoinPool;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        String opcion;

        do{

            System.out.println("Ingrese el número de ejercicio (1-11) o ingrese 0 para salir: ");
            opcion = scanner.nextLine();

            switch (opcion) {
                case "1" -> {
                    int[] numberArray = new int[10];
                    int sumaPositivos = 0;
                    int sumaNegativos = 0;
                    int contPositivos = 0;
                    int contNegativos = 0;

                    //loop para ingreso de números
                    for (int i = 0; i < 10; i++) {
                        System.out.println("Ingrese un número entero: ");
                        numberArray[i] = scanner.nextInt();
                    }

                    //Loop de suma de positivos y negativos y contadores
                    for (int number: numberArray) {
                        if (number > 0 ){
                            sumaPositivos += number;
                            contPositivos++;
                        } else {
                            sumaNegativos += number;
                            contNegativos++;
                        }
                    }

                    //impresión de la media de positivos y negativos
                    //media de positivos
                    if(contPositivos>0) {
                        System.out.println("La media de números positivos es " + (double) sumaPositivos / contPositivos);
                    }else {
                        System.out.println("No hubo números negativos");
                    }

                    //media de negativos
                    if (contNegativos>0) {
                        System.out.println("La media de números negativos es " + (double) sumaNegativos / contNegativos);
                    } else {
                        System.out.println("No hubo números negativos");
                    }
                }
                case "2" -> {
                    int[] numberArray = new int[10];
                    int suma = 0;

                    //Loop para ingreso de números
                    for (int i = 0; i < 10; i++) {
                        System.out.println("Ingrese un número entero: ");
                        numberArray[i] = scanner.nextInt();
                    }

                    //loop para calcular media de numeros en posiciones pares
                    for (int i = 0; i < 10; i+=2) {
                        suma += numberArray[i];
                    }

                    //mostrar resultados en pantalla
                    System.out.println("La media de números en posiciones pares es: " + (suma/5));
                }
                case "3" -> {
                    System.out.println("Ingrese la cantidad de estudiantes: ");
                    int cant = scanner.nextInt();

                    //Ingreso de notas
                    double[] notas = new double[cant];
                    for (int i = 0; i < cant; i++) {
                        System.out.println("Ingrese la nota del alumno " + (i+1));
                        notas[i] = scanner.nextDouble();
                    }

                    //Sumar notas y calcular media
                    double suma = 0;
                    for (int i = 0; i < cant; i++) {
                        suma += notas[i];
                    }
                    double media = suma/cant;
                    System.out.println("La media es de: " + media);

                    //Mostrar alumnos con notas superiores a la media
                    double[] mediaMayor = Arrays.stream(notas).filter(valor -> valor > media).toArray();
                    StringJoiner joiner = new StringJoiner(", ");
                    for (double nota: mediaMayor) {
                        joiner.add(Double.toString(nota));
                    }
                    System.out.println("Las notas de los alumnos que fueron superiores a la media son: " + joiner);
                }
                case "4" -> {
                    int[] Pares = new int[20];
                    int cont = 0;
                    while(cont < 20){
                        Pares[cont] = cont*2;
                        cont++;
                    }
                    //Imprimir los numeros
                    System.out.println("Los primeros 20 números pares son:");
                    for (int i = 0; i < Pares.length; i++) {
                        System.out.print(Pares[i]);
                        if (i < Pares.length-1){
                            System.out.print(", ");
                        }
                    }
                    //salto de linea para seguir con el bucle principal
                    System.out.println();
                }
                case "5" -> {
                    int[] numbers = new int[10];

                    //Ingresar números al array
                    for (int i = 0; i < 10; i++) {
                        System.out.println("Ingrese un número: ");
                        numbers[i] = scanner.nextInt();
                    }

                    //calcular positivos, negativos y ceros
                    int cant0 = 0;
                    int cantPositivos = 0;
                    int cantNegativos = 0;
                    for (int i = 0; i < 10; i++) {
                        if (numbers[i] == 0){
                            cant0++;
                        } else if(numbers[i] < 0){
                            cantNegativos++;
                        } else {
                            cantPositivos++;
                        }
                    }

                    System.out.println("La cantidad de Números positivos es " + cantPositivos + ", la cantidad de números negativos es " + cantNegativos + " y la cantidad de números 0 es " + cant0);

                }
                case "6" -> {
                    int[] numbers = new int[10];

                    //Ingresar números al array
                    for (int i = 0; i < 10; i++) {
                        System.out.println("Ingrese un número: ");
                        numbers[i] = scanner.nextInt();
                    }

                    //calcular positivos, negativos y ceros
                    int cantPositivos = 0;
                    int sumaPositivos = 0;
                    int cantNegativos = 0;
                    int sumaNegativos = 0;
                    for (int i = 0; i < 10; i++) {
                        if (numbers[i] != 0) {
                            if (numbers[i] < 0) {
                                cantNegativos++;
                                sumaNegativos += numbers[i];
                            } else {
                                cantPositivos++;
                                sumaPositivos += numbers[i];
                            }
                        }
                    }

                    //media de positivos
                    if(cantPositivos>0) {
                        System.out.println("La media de números positivos es " + (double) sumaPositivos / cantPositivos);
                    }else {
                        System.out.println("No hubo números negativos");
                    }

                    //media de negativos
                    if (cantNegativos>0) {
                        System.out.println("La media de números negativos es " + (double) sumaNegativos / cantNegativos);
                    } else {
                        System.out.println("No hubo números negativos");
                    }
                }
                case "7" -> {
                    int N;
                    do {
                        System.out.println("Ingrese el número de personas: ");
                        N = scanner.nextInt();
                        if(N<=0){
                            System.out.println("El número debe ser entero positivo");
                        }
                    } while(N<=0);

                    int suma = 0;

                    //loop para ingreso de números
                    int[] alturas = new int[N];
                    for (int i = 0; i < N; i++) {
                        System.out.println("Ingrese la altura de la persona " + (i+1));
                        alturas[i] = scanner.nextInt();
                        if (alturas[i] > 0 ){
                            suma += alturas[i];
                        } else {
                            i--;
                        }
                    }

                    //media de alturas
                    double media = (double) suma / N;

                    //cant de alturas menores a la media
                    int contMenor = 0;
                    for (int altura: alturas) {
                        if (altura < media){
                            contMenor++;
                        }
                    }
                    System.out.println("La media de altura es " + media + " y la cantidad de personas con altura inferior a la media es " + contMenor);
                }
                case "8" -> {
                    //inicio hashmap para guardar los valores
                    int cantEmpleados = 20;
                    String[] nombres = new String[cantEmpleados];
                    double[] sueldos = new double[cantEmpleados];

                    String nombre = "";
                    double mayorSueldo = 0;

                    //loop para ingresar valores
                    for (int i = 0; i < cantEmpleados; i++) {
                        System.out.println("Ingrese el nombre del empleado " + (i+1));
                        nombres[i] = scanner.nextLine();

                        System.out.println("Ingrese el sueldo del empleado " + (i+1));
                        sueldos[i] = scanner.nextDouble();
                        scanner.nextLine();

                        if (sueldos[i] > mayorSueldo) {
                            nombre = nombres[i];
                            mayorSueldo = sueldos[i];
                        }
                    }
                    System.out.println("El empleado que gana más es " + nombre + ", quien gana " + mayorSueldo);
                }
                case "9" -> {
                    System.out.println("Ingrese desde que número: ");
                    int desde = scanner.nextInt();
                    System.out.println("Ingrese hasta que número: ");
                    int hasta = scanner.nextInt();
                    System.out.println("Ingrese la cantidad de números que quiere obtener: ");
                    int cant = scanner.nextInt();
                    scanner.nextLine();

                    //para que los números sean siempre de menor a mayor
                    if (desde > hasta){
                        int aux = desde;
                        desde = hasta;
                        hasta = aux;
                    }

                    // iniciamos la funcion para rellenar el array y lo asignamos
                    int[] randoms = ListaDeRandoms(desde, hasta, cant);

                    //Mostrar los números por consola
                    System.out.println("Los números obtenidos son: ");
                    for (int number: randoms) {
                        System.out.println(number);
                    }
                }
                case "10" -> {
                    System.out.println("Ingresa el número de filas de las matrices:");
                    int filas = LeerNumero();
                    System.out.println("Ingresa el número de columnas de las matrices:");
                    int columnas = LeerNumero();
                    scanner.nextLine();

                    int[][] matrizA = CrearMatriz(filas,columnas);
                    int[][] matrizB = CrearMatriz(filas, columnas);

                    System.out.println("Ingrese los valores para la matriz A");
                    LlenarMatriz(matrizA);
                    System.out.println("Ingrese los valores para la matriz B");

                    LlenarMatriz(matrizB);

                    System.out.println("La matriz A es:");
                    MostrarMatriz(matrizA);
                    System.out.println("La matriz B es:");
                    MostrarMatriz(matrizB);

                    int[][] matrizC = SumaMatrices(matrizA, matrizB);

                    System.out.println("La matriz C es:");
                    MostrarMatriz(matrizC);
                }
                case "11" -> {
                    System.out.println("Ingresa el número de filas de la matriz:");
                    int filas = LeerNumero();
                    System.out.println("Ingresa el número de columnas de la matriz:");
                    int columnas = LeerNumero();
                    scanner.nextLine();

                    int[][] matriz = CrearMatriz(filas, columnas);
                    LlenarMatriz(matriz);
                    System.out.println("La matriz es:");
                    MostrarMatriz(matriz);

                    int[][] transpuesta = MatrizTranspuesta(matriz);

                    System.out.println("La matriz transpuesta es:");
                    MostrarMatriz(transpuesta);
                }

                case "0" -> System.out.println("Saliendo del programa.");
                default -> System.out.println("Opción no válida. Por favor, elija una opción válida.");
            }
        } while (!opcion.equals("0"));
    }

    public static int[] ListaDeRandoms(int desde, int hasta, int cant){
        Random random = new Random();

        int[] numRandom = new int[cant];
        for (int i = 0; i < cant; i++) {
            numRandom[i] = random.nextInt(hasta - desde + 1) + desde;
        }

        return numRandom;
    }

    public static int LeerNumero() {
        return scanner.nextInt();
    }

    public static int[][] CrearMatriz(int filas, int columnas) {
        return new int[filas][columnas];
    }

    public static void LlenarMatriz(int[][] matriz){
        //loop para ingresar los valores de cada posición de cada matriz
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.println("Ingrese el valor para la fila " + i + ",columna " + j);
                matriz[i][j] = scanner.nextInt();
            }
        }
    }

    public static void MostrarMatriz(int[][] matriz){
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[][] SumaMatrices(int[][] matrizA, int[][] matrizB){

        int[][] total = new int[matrizA.length][matrizA[0].length];

        for (int i = 0; i < total.length; i++) {
            for (int j = 0; j < total[0].length; j++) {
                total[i][j] = matrizA[i][j] + matrizB[i][j];
            }
        }
        return total;
    }

    public static int[][] MatrizTranspuesta(int[][] matriz){
        int[][] transpuesta = new int[matriz[0].length][matriz.length];
        for (int i = 0; i < transpuesta.length; i++) {
            for (int j = 0; j < transpuesta[0].length; j++) {
                transpuesta[i][j]= matriz[j][i];
            }
        }
        return  transpuesta;
    }
}
