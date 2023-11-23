import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

    }

    public static void imprimirMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }

    //    1.	Escribir un método para sumar dos matrices de enteros y devolver la matriz resultante.

    public class SumaMatrices {

        public static int[][] sumarMatrices(int[][] matriz1, int[][] matriz2) {
            if (matriz1.length != matriz2.length || matriz1[0].length != matriz2[0].length) {
                throw new IllegalArgumentException("Las matrices deben tener las mismas dimensiones para poder sumarlas.");
            }

            int filas = matriz1.length;
            int columnas = matriz1[0].length;

            int[][] resultado = new int[filas][columnas];

            for (int i = 0; i < filas; i++) {
                for (int j = 0; j < columnas; j++) {
                    resultado[i][j] = matriz1[i][j] + matriz2[i][j];
                }
            }
            return resultado;
        }
    }

    // 2.	Implementar un método para multiplicar dos matrices de enteros y devolver el resultado.
    public static int[][] multiplicarMatrices(int[][] matriz1, int[][] matriz2) {
        int filas1 = matriz1.length;
        int columnas1 = matriz1[0].length;
        int columnas2 = matriz2[0].length;

        if (columnas1 != matriz2.length) {
            throw new IllegalArgumentException("El número de columnas de la matriz 1 debe ser igual al número de filas de la matriz 2 para poder multiplicarlas.");
        }

        int[][] resultado = new int[filas1][columnas2];

        for (int i = 0; i < filas1; i++) {
            for (int j = 0; j < columnas2; j++) {
                for (int k = 0; k < columnas1; k++) {
                    resultado[i][j] += matriz1[i][k] * matriz2[k][j];
                }
            }
        }

        return resultado;
    }

    // 3.	Crear una función que calcule la transpuesta de una matriz.
    public static int[][] transpuesta(int[][] matriz) {
        int filas = matriz.length;
        int columnas = matriz[0].length;
        int[][] transpuesta = new int[columnas][filas];

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                transpuesta[j][i] = matriz[i][j];
            }
        }

        return transpuesta;
    }

    //4.	Desarrollar un método para verificar si una matriz es simétrica (igual a su transpuesta).
    public static boolean esSimetrica(int[][] matriz) {
        int filas = matriz.length;
        int columnas = matriz[0].length;

        if (filas != columnas) {
            return false;
        }

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                if (matriz[i][j] != matriz[j][i]) {
                    return false;
                }
            }
        }
        return true;
    }

    //5.	Escribir un método que calcule el producto escalar de un vector (matriz unidimensional) por un número.
    public static int[] productoEscalar(int[] vector, int escalar) {
        int[] resultado = new int[vector.length];

        for (int i = 0; i < vector.length; i++) {
            resultado[i] = vector[i] * escalar;
        }

        return resultado;
    }

    //6.	Implementar una función que calcule la suma de todos los elementos de una matriz.
    public static int sumaElementos(int[][] matriz) {
        int suma = 0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                suma += matriz[i][j];
            }
        }

        return suma;
    }

    //7.	Desarrollar un método para encontrar el elemento máximo en una matriz y su posición.
    public static int[] encontrarMaximo(int[][] matriz) {
        int max = matriz[0][0];
        int filaMax = 0;
        int columnaMax = 0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] > max) {
                    max = matriz[i][j];
                    filaMax = i;
                    columnaMax = j;
                }
            }
        }

        int[] resultado = { max, filaMax, columnaMax };
        return resultado;
    }

    //8.	Crear una función que devuelva la suma de una fila específica de una matriz.
    public static int sumaFila(int[][] matriz, int fila) {
        if (fila < 0 || fila >= matriz.length) {
            throw new IllegalArgumentException("Índice de fila fuera de rango.");
        }

        int suma = 0;

        for (int j = 0; j < matriz[fila].length; j++) {
            suma += matriz[fila][j];
        }

        return suma;
    }

    //9. Implementar una función que determine si una matriz es diagonal (todos los elementos fuera de la diagonal principal son cero).
    public static boolean esDiagonal(int[][] matriz) {
        int filas = matriz.length;
        int columnas = matriz[0].length;

        if (filas != columnas) {
            return false;
        }

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                if (i != j && matriz[i][j] != 0) {
                    return false;
                }
            }
        }

        return true;
    }

    //10.	Crear una función que genere una matriz identidad de tamaño n.
    public static int[][] matrizIdentidad(int n) {
        int[][] matrizIdentidad = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    matrizIdentidad[i][j] = 1;
                } else {
                    matrizIdentidad[i][j] = 0;
                }
            }
        }

        return matrizIdentidad;
    }

    //11.	Escribir un método para contar la cantidad de elementos pares e impares en una matriz.
    public static int[] contarParesImpares(int[][] matriz) {
        int pares = 0;
        int impares = 0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] % 2 == 0) {
                    pares++;
                } else {
                    impares++;
                }
            }
        }
        int[] resultados = {pares, impares};

        return resultados;
    }

    //12.	Implementar una función que rote una matriz 90 grados en sentido horario.
    public static int[][] rotar90Grados(int[][] matriz) {
        int filas = matriz.length;
        int columnas = matriz[0].length;

        int[][] matrizRotada = new int[columnas][filas];

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matrizRotada[j][filas - 1 - i] = matriz[i][j];
            }
        }

        return matrizRotada;
    }

    //13.	Desarrollar un método para encontrar el número de veces que aparece un valor específico en una matriz.
    public static int contarValor(int[][] matriz, int valor) {
        int cont = 0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] == valor) {
                    cont++;
                }
            }
        }

        return cont;
    }

    //14.	Crear una función que invierta el orden de las filas en una matriz.
    public static int[][] invertirFilas(int[][] matriz) {
        int filas = matriz.length;
        int columnas = matriz[0].length;
        int[][] matrizInvertida = new int[filas][columnas];

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matrizInvertida[i][j] = matriz[filas - 1 - i][j];
            }
        }

        return matrizInvertida;
    }

    //15.	Escribir un método para sumar todas las diagonales de una matriz cuadrada.
    public static int sumarDiagonales(int[][] matriz) {
        int suma = 0;
        int n = matriz.length;

        for (int i = 0; i < n; i++) {
            suma += matriz[i][i];
            suma += matriz[i][n - 1 - i];
        }

        if (n % 2 == 1) {
            suma -= matriz[n / 2][n / 2];
        }

        return suma;
    }

    //16.	Implementar una función que verifique si una matriz es ortogonal (su transpuesta es igual a su inversa).
    public static boolean esOrtogonal(double[][] matriz) {
        int filas = matriz.length;
        int columnas = matriz[0].length;

        if (filas != columnas) {
            return false;
        }

        double[][] transpuesta = new double[filas][columnas];
        double[][] inversa = new double[filas][columnas];

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                transpuesta[i][j] = matriz[j][i];
            }
        }

        if (!esIgual(matriz, inversa)) {
            return false;
        }

        return true;
    }
    public static boolean esIgual(double[][] matriz1, double[][] matriz2) {
        int filas = matriz1.length;
        int columnas = matriz1[0].length;

        if (matriz2.length != filas || matriz2[0].length != columnas) {
            return false;
        }

        for (int i = 0; i < filas; i++) {
            if (!Arrays.equals(matriz1[i], matriz2[i])) {
                return false;
            }
        }

        return true;
    }

    //17.	Desarrollar un método para encontrar el valor mínimo en cada fila de una matriz y devolverlos en un arreglo.
    public static int[] encontrarValoresMinimosPorFila(int[][] matriz) {
        int filas = matriz.length;
        int[] valoresMinimos = new int[filas];

        for (int i = 0; i < filas; i++) {
            int minimo = matriz[i][0];
            for (int j = 1; j < matriz[i].length; j++) {
                if (matriz[i][j] < minimo) {
                    minimo = matriz[i][j];
                }
            }
            valoresMinimos[i] = minimo;
        }

        return valoresMinimos;
    }

    //18.	Crear una función que calcule el producto de matrices de diferentes tamaños, si es posible; de lo contrario, devolver una matriz nula.
    public static int[][] productoMatrices(int[][] matriz1, int[][] matriz2) {
        int filas1 = matriz1.length;
        int columnas1 = matriz1[0].length;
        int filas2 = matriz2.length;
        int columnas2 = matriz2[0].length;

        if (columnas1 != filas2) {
            return null;
        }

        int[][] resultado = new int[filas1][columnas2];

        for (int i = 0; i < filas1; i++) {
            for (int j = 0; j < columnas2; j++) {
                int sum = 0;
                for (int k = 0; k < columnas1; k++) {
                    sum += matriz1[i][k] * matriz2[k][j];
                }
                resultado[i][j] = sum;
            }
        }

        return resultado;
    }
}
