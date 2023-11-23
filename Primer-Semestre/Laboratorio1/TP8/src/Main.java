public class Main {
    public static void main(String[] args) {

    }

    // 1. Método para sumar dos matrices de enteros y devolver la matriz resultante
    public static int[][] sumarMatrices(int[][] matriz1, int[][] matriz2) {
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

    // 2. Método para multiplicar dos matrices de enteros y devolver el resultado
    public static int[][] multiplicarMatrices(int[][] matriz1, int[][] matriz2) {
        int filas1 = matriz1.length;
        int columnas1 = matriz1[0].length;
        int columnas2 = matriz2[0].length;
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

    // 3. Método para calcular la transpuesta de una matriz
    public static int[][] matrizTranspuesta(int[][] matriz) {
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

    // 4. Método para verificar si una matriz es simétrica
    public static boolean esMatrizSimetrica(int[][] matriz) {
        int filas = matriz.length;
        int columnas = matriz[0].length;

        if (filas != columnas) {
            return false;
        }

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < i; j++) {
                if (matriz[i][j] != matriz[j][i]) {
                    return false;
                }
            }
        }
        return true;
    }

    // 5. Método para calcular el producto escalar de un vector por un número
    public static int[] productoEscalar(int[] vector, int escalar) {
        int n = vector.length;
        int[] resultado = new int[n];

        for (int i = 0; i < n; i++) {
            resultado[i] = vector[i] * escalar;
        }
        return resultado;
    }

    // 6. Método para calcular la suma de todos los elementos de una matriz
    public static int sumaElementosMatriz(int[][] matriz) {
        int suma = 0;
        for (int[] fila : matriz) {
            for (int elemento : fila) {
                suma += elemento;
            }
        }
        return suma;
    }

    // 7. Método para encontrar el elemento máximo en una matriz y su posición
    public static int[] encontrarMaximo(int[][] matriz) {
        int maximo = matriz[0][0];
        int filaMaximo = 0;
        int columnaMaximo = 0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] > maximo) {
                    maximo = matriz[i][j];
                    filaMaximo = i;
                    columnaMaximo = j;
                }
            }
        }

        int[] resultado = { maximo, filaMaximo, columnaMaximo };
        return resultado;
    }

    // 8. Método para calcular la suma de una fila específica de una matriz
    public static int sumaFilaEspecifica(int[][] matriz, int fila) {
        int suma = 0;
        for (int elemento : matriz[fila]) {
            suma += elemento;
        }
        return suma;
    }

    // 9. Método para determinar si una matriz es diagonal
    public static boolean esMatrizDiagonal(int[][] matriz) {
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

    // 10. Método para generar una matriz identidad de tamaño n
    public static int[][] matrizIdentidad(int n) {
        int[][] identidad = new int[n][n];
        for (int i = 0; i < n; i++) {
            identidad[i][i] = 1;
        }
        return identidad;
    }

    // 11. Método para contar la cantidad de elementos pares e impares en una matriz
    public static int[] contarParesEImpares(int[][] matriz) {
        int pares = 0;
        int impares = 0;

        for (int[] fila : matriz) {
            for (int elemento : fila) {
                if (elemento % 2 == 0) {
                    pares++;
                } else {
                    impares++;
                }
            }
        }

        int[] resultado = { pares, impares };
        return resultado;
    }

    // 12. Método para rotar una matriz 90 grados sentido horario
    public static int[][] rotarMatriz90Grados(int[][] matriz) {
        int filas = matriz.length;
        int columnas = matriz[0].length;
        int[][] resultado = new int[columnas][filas];

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                resultado[j][filas - 1 - i] = matriz[i][j];
            }
        }

        return resultado;
    }

    // 13. Método para encontrar el número de veces que aparece un valor específico en una matriz
    public static int contarValorEnMatriz(int[][] matriz, int valor) {
        int conteo = 0;

        for (int[] fila : matriz) {
            for (int elemento : fila) {
                if (elemento == valor) {
                    conteo++;
                }
            }
        }

        return conteo;
    }

    // 14.Método para invertir el orden de las filas en una matriz
    public static int[][] invertirFilas(int[][] matriz) {
        int filas = matriz.length;
        int columnas = matriz[0].length;
        int[][] resultado = new int[filas][columnas];

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                resultado[i][j] = matriz[filas - 1 - i][j];
            }
        }

        return resultado;
    }

    // 15. Método para sumar todas las diagonales de una matriz cuadrada
    public static int sumaDiagonalesMatriz(int[][] matriz) {
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

    // 16. Método para verificar si una matriz es ortogonal
    public static boolean esMatrizOrtogonal(int[][] matriz) {
        int filas = matriz.length;
        int columnas = matriz[0].length;

        if (filas != columnas) {
            return false;
        }

        int[][] transpuesta = matrizTranspuesta(matriz);
        int[][] producto = multiplicarMatrices(matriz, transpuesta);

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < filas; j++) {
                if (i == j && producto[i][j] != 1) {
                    return false;
                } else if (i != j && producto[i][j] != 0) {
                    return false;
                }
            }
        }

        return true;
    }

    //  17. Método para encontrar el valor mínimo en cada fila de una matriz
    public static int[] encontrarMinimoFila(int[][] matriz) {
        int filas = matriz.length;
        int[] minimos = new int[filas];

        for (int i = 0; i < filas; i++) {
            int minimo = matriz[i][0];
            for (int j = 1; j < matriz[i].length; j++) {
                if (matriz[i][j] < minimo) {
                    minimo = matriz[i][j];
                }
            }
            minimos[i] = minimo;
        }

        return minimos;
    }

    // 18. Método para calcular el producto de matrices de diferentes tamaños, si es posible
    public static int[][] productoDeMatrices(int[][] matriz1, int[][] matriz2) {
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
