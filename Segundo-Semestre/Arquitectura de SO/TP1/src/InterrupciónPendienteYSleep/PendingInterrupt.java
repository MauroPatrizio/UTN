package practicos.tp1.InterrupciónPendienteYSleep;

public class PendingInterrupt {
    public static void main(String[] args) {
        if (args.length > 0) {
            Thread.currentThread().interrupt();
        }
        long tiempoInicial = System.currentTimeMillis();
        try {
            Thread.sleep(2000);
            System.out.println("No es interrumpida");
        } catch (InterruptedException e) {
            System.out.println("Es interrumpida");
        }
        System.out.println("Tiempo gastado: " + (System.currentTimeMillis() - tiempoInicial));
    }
}

/**
 * 1. Verifica si se proporcionan argumentos de línea de comandos. Si hay
 * argumentos, interrumpe el hilo actual (Thread.currentThread().interrupt()).
 * 2. Guarda el tiempo actual en milisegundos antes de iniciar la ejecución real
 * del código.
 * 3. Intenta dormir el hilo principal durante 2000 milisegundos utilizando
 * Thread.sleep(2000).
 * 4. Si el hilo es interrumpido mientras está dormido, se lanzará una excepción
 * InterruptedException y se imprimirá "Es interrumpida".
 * 5. Si el hilo no es interrumpido y el tiempo de espera termina, se imprime
 * "No es interrumpida".
 * 6. Calcula el tiempo transcurrido desde el inicio de la ejecución hasta este
 * punto, restando el tiempo inicial del tiempo actual.
 * 7. Imprime el tiempo gastado en la ejecución del programa.
 */
