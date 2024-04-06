package practicos.tp1.InterruptedException;

public class Ejemplo_Fin_por_Interrupt {
    public static void main(String[] args) {
        Thread elThread = new MiThread();
        elThread.start();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
        }
        ;
        elThread.interrupt();
    }
}

/**
 * 1. Se crea una instancia de MiThread y se inicia su ejecución.
 * 2. El hilo MiThread entra en un bucle infinito, imprimiendo "Ejecuto" en la
 * consola y luego durmiendo durante 100 milisegundos en cada iteración.
 * 3. Después de que el hilo se ha ejecutado durante aproximadamente 1000
 * milisegundos (1 segundo), el hilo principal (el hilo que ejecuta el método
 * main()) interrumpe el hilo MiThread llamando a elThread.interrupt().
 * 4. Cuando el hilo MiThread es interrumpido, se lanza una excepción
 * InterruptedException dentro del bloque catch. En este caso, se imprime
 * "Termino en sleep".
 * 5. El hilo MiThread luego sale del bucle infinito y termina su ejecución.
 */
