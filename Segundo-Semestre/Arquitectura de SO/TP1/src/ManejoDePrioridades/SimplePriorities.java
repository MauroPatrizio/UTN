package practicos.tp1.ManejoDePrioridades;

public class SimplePriorities extends Thread {
    private int countDown = 5;
    private volatile double d = 0; // No optimization

    public SimplePriorities(int priority) {
        setPriority(priority);
        start();
    }

    public String toString() {
        return super.toString() + ": " + countDown;
    }

    public void run() {
        while (true) {
            // An expensive, interruptable operation:
            for (int i = 1; i < 100000; i++)
                d = d + (Math.PI + Math.E) / (double) i;
            System.out.println(this);
            synchronized (this) {
                if (--countDown == 0)
                    return;
            }
        }
    }

    public static void main(String[] args) {
        new SimplePriorities(Thread.MAX_PRIORITY);
        for (int i = 0; i < 5; i++)
            new SimplePriorities(Thread.MIN_PRIORITY);
    }
}

/**
 * 1. La clase SimplePriorities extiende la clase Thread y sobrescribe el método
 * run(). Cada hilo creado realizará operaciones costosas en un bucle while
 * infinito.
 * 2. Cada hilo tiene su propio contador countDown que se inicializa en 5 y se
 * decrementa en cada iteración del bucle. Una vez que el contador llega a cero,
 * el hilo sale del bucle y termina su ejecución.
 * 3. Cada hilo también tiene un campo d de tipo double que se actualiza en cada
 * iteración del bucle con cálculos costosos que involucran las constantes
 * matemáticas π y e.
 * 4. En el método main(), se crean varios hilos SimplePriorities con diferentes
 * prioridades. Se crea un hilo con la máxima prioridad (Thread.MAX_PRIORITY) y
 * cinco hilos con la mínima prioridad (Thread.MIN_PRIORITY).
 * 5. Cada hilo se inicia automáticamente cuando se crea.
 */
