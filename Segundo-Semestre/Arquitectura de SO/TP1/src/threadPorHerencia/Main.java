package practicos.tp1.threadPorHerencia;

public class Main {
    public static void main(String[] args) {
        // Declaración de 2 threads
        PingPong1 t1 = new PingPong1("PING", 33);
        PingPong1 t2 = new PingPong1("PONG", 10);
        // Activación
        t1.start();
        t2.start();
        // Espera 2 segundos
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
        }
        // Finaliza la ejecución de los threads
        t1.stop();
        t2.stop();
    }

}

/**
 * El programa crea dos hilos secundarios que imprimen las palabras "PING" y
 * "PONG" de forma intercalada en la consola durante dos segundos. Cada hilo
 * imprime su palabra asociada repetidamente, con un cierto retraso entre cada
 * impresión.
 */
