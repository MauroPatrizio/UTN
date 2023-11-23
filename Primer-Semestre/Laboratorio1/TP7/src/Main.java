import java.util.*;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        Integer[] enteros = {5, 7, 9, 14, 21, 0, 31, 4, 10, 18, 23, 1};
        Double[] doubles = {20.1, 4., 17.5, 88.8, 15.9, 16.4};
        String[] strings = {"coso", "monitor", "teclado", "mouse", "tarjeta", "lentes"};
        List<Perro> perros = new ArrayList<>();
            perros.add(new Perro("marcos", 2));
            perros.add(new Perro("picho", 21));
            perros.add(new Perro("milo", 1));



        String opt;
        do{

            System.out.println("Ingrese número de ejercicio, Q to quit");
            opt = scanner.nextLine().toUpperCase();

            if(!opt.equals("Q")) {
                switch (opt) {
                    case "1" -> ej1(enteros);
                    case "2" -> ej2(enteros);
                    case "3" -> ej3(doubles);
                    case "4" -> ej4(doubles);
                    case "5" -> ej5(strings);
                    case "6" -> ej6(strings);
                    case "7" -> ej7(perros);
                    case "8" -> ej8(perros);
                    case "9" -> mostrarArray(ej9(enteros));
                    case "10" -> mostrarArray(ej10(enteros));
                    case "11" -> mostrarArray(ej11(enteros));
                    case "12" -> {ej12(enteros, 0, enteros.length -1);
                                  mostrarArray(enteros);}
                    case "13" -> ej13(enteros);
                    case "14" -> ej14();
                    default -> System.out.println("Invalid input");
                }
            } else {
                System.out.println("Cerrando el programa");
            }
        } while(!opt.equals("Q"));

    }
    public static <T> void mostrarArray(T[] array){
        for (T i: array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static <T> void mostrarLista(Iterable<T> iterable){
        for (T i: iterable) {
            System.out.println(i.toString());
        }
    }

    //1. Ordenar un array de números enteros de menor a mayor.
    public static void ej1(Integer[] enteros){
       Arrays.sort(enteros);
        mostrarArray(enteros);
    }

    //2. Ordenar un array de números enteros de mayor a menor.
    public static void ej2(Integer[] enteros){
        Arrays.sort(enteros, Collections.reverseOrder());

        mostrarArray(enteros);
    }

    //3. Ordenar un array de números flotantes de menor a mayor.
    public static void ej3(Double[] flotantes){
        Arrays.sort(flotantes);

        mostrarArray(flotantes);
    }

    //4. Ordenar un array de números flotantes de mayor a menor.
    public static void ej4(Double[] flotantes){
        Arrays.sort(flotantes, Collections.reverseOrder());

        mostrarArray(flotantes);
    }

    //5. Ordenar un array de cadenas de texto en orden alfabético.
    public static void ej5(String[] cadenas){
        Arrays.sort(cadenas);

        mostrarArray(cadenas);
    }

    //6. Ordenar un array de cadenas de texto en orden inverso.
    public static void ej6(String[] cadenas){
        Arrays.sort(cadenas, Collections.reverseOrder());

        mostrarArray(cadenas);
    }

    //7. Ordenar un array de objetos de una clase personalizada.
    public static void ej7(List<Perro> perros){
        Collections.sort(perros, Comparator.comparingInt(Perro::getEdad));

        mostrarLista(perros);
    }

    //8. Ordenar un array de objetos de una clase personalizada por un atributo específico.
    public static void ej8(List<Perro> perros){
        Collections.sort(perros, Comparator.comparing(Perro::getName));

        mostrarLista(perros);
    }

    //9. Ordenar un array de números enteros utilizando el algoritmo de ordenamiento burbuja.
    public static Integer[] ej9(Integer[] enteros){
        int aux;
        for (int i = 0; i < enteros.length -1; i++) {
            for (int j = 0; j < enteros.length - i -1 ; j++) {
                if (enteros[j + 1] < enteros[j]) {
                    aux = enteros[j + 1];
                    enteros[j + 1] = enteros[j];
                    enteros[j] = aux;
                }
            }
        }

        return enteros;
    }

    //10. Ordenar un array de números enteros utilizando el algoritmo de ordenamiento por selección.
    public static Integer[] ej10(Integer[] enteros){
        int menor, posicion, aux;
        for (int i = 0; i < enteros.length -1; i++) {
            menor = enteros[i];
            posicion = i;
            for (int j = i + 1; j < enteros.length; j++) {
                if (enteros[j] < menor){
                    menor = enteros[j];
                    posicion = j;
                }
            }
            if (posicion != i ){
                aux = enteros[i];
                enteros[i] = enteros[posicion];
                enteros[posicion] = aux;
            }
        }

        return enteros;
    }

    //11. Ordenar un array de números enteros utilizando el algoritmo de ordenamiento por inserción.
    public static Integer[] ej11(Integer[] enteros) {
        int aux, j;
        for (int i = 1; i < enteros.length; i++) {
            aux = enteros[i];
            j = i -1;
            while ((j>=0) && (aux < enteros[j])){
                enteros[j+1] = enteros[j];
                j--;
            }
            enteros[j+1] = aux;
        }

        return enteros;
    }

    //12. Ordenar un array de números enteros utilizando el algoritmo de ordenamiento por mezcla(MergeSort).
    public static void ej12(Integer[] enteros, int izq, int der) {

        if (izq < der){
            int m=(izq+der)/2;
            ej12(enteros,izq, m);
            ej12(enteros,m+1, der);
            merge(enteros,izq, m, der);
        }
    }
    public static void merge(Integer[] enteros, int izq, int m, int der){
        int i, j, k;
        int [] B = new int[enteros.length];
        for (i=izq; i<=der; i++) {
            B[i] = enteros[i];
        }
        i=izq; j=m+1; k=izq;

        while (i<=m && j<=der) {
            if (B[i] <= B[j])
                enteros[k++] = B[i++];
            else
                enteros[k++] = B[j++];
        }
        while (i<=m) {
            enteros[k++] = B[i++];
        }
    }
    //13. Ordenar un array de números enteros utilizando el algoritmo de ordenamiento shell.
    public static void ej13(Integer[] enteros){
        int salto, aux;
        boolean cambios;

        for (salto = enteros.length / 2; salto != 0; salto /= 2) {
            cambios = true;
            while (cambios) {
                cambios = false;
                for (int i = salto; i < enteros.length; i++)
                {
                    if (enteros[i - salto] > enteros[i]) {
                        aux = enteros[i];
                        enteros[i] = enteros[i - salto];
                        enteros[i - salto] = aux;
                        cambios = true;
                    }
                }
            }
        }

        mostrarArray(enteros);
    }

    //14. Codifique un algoritmo que permita cargar un array de una dimensión de 20 elementos enteros.
    // Finalizada la carga de los 20 elementos el programa debe solicitar como se desea ordenar el array ASCENDENTE O DESCENDENTE y que método de ordenamiento aplicar (inserción, burbuja, selección),
    // según las opciones elegidas aplique el algoritmos fundamental de ordenamiento que corresponda.
    // Muestre por pantalla el array original desordenado y su resultante ordenado según las opciones elegidas.
    public static void ej14(){
        Integer[] array = new Integer[5];

        System.out.println("Ingrese 20 números enteros:");
        for (int i = 0; i < array.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }
        scanner.nextLine();

        String orden;
        do{
            System.out.print("Cómo quiere ordenar el array? (Ingrese A para ascendente, D para descendente): ");
            orden = scanner.nextLine().toUpperCase();
        } while (!orden.equals("A") && !orden.equals("D"));

        String metodo;
        do{
            System.out.print("Elija el método de ordenamiento (Ingrese 1 para inserción, 2 para burbuja o 3 para selección): ");
            metodo = scanner.nextLine();
        } while (!metodo.equals("1") && !metodo.equals("2") && !metodo.equals("3"));

        switch (orden){
            case "A" -> {
                switch (metodo){
                    case "1" -> ej11(array);
                    case "2" -> ej9(array);
                    case "3" -> ej10(array);
                }
            }
            case "D" -> {
                switch (metodo){
                    case "1" -> Arrays.sort(ej11(array), Collections.reverseOrder());
                    case "2" -> Arrays.sort(ej9(array), Collections.reverseOrder());
                    case "3" -> Arrays.sort(ej10(array), Collections.reverseOrder());
                }
            }
        }

        mostrarArray(array);
    }
}
