package practicos.tp1.threadInterfazRunnable;

public class Main {
    public static void main(String[] args) {
        // Los objetos r1 y r2 definen la funcionalidad.
        // (definen los métodos run())
        PingPong2 r1 = new PingPong2("PING", 33);
        PingPong2 r2 = new PingPong2("PONG", 10);
        // Se crean los threads
        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);
        // Se activan los threads
        t1.start();
        t2.start();
    }
}

/**
 * El programa crea dos hilos secundarios que imprimen las palabras "PING" y
 * "PONG" de forma intercalada en la consola en un ciclo infinito. Cada hilo
 * imprime su palabra asociada repetidamente, con un cierto retraso entre cada
 * impresión.
 */
