package practicos.tp1.interruptEinterrupted;

public class Ejemplo_Fin_por_Interrupt {
    public static void main(String[] args) {
        Thread elThread = new MiThread();
        elThread.start();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
        }
        elThread.interrupt();
    }
}

/**
 * 1. Se crea una instancia de MiThread y se inicia su ejecución.
 * 2. El hilo MiThread entra en un bucle que se ejecuta mientras el hilo no ha
 * sido interrumpido. En cada iteración del bucle, se imprime "Ejecuto" en la
 * consola.
 * 3. Después de que el hilo ha estado ejecutándose durante aproximadamente 1000
 * milisegundos (1 segundo), el hilo principal (el hilo que ejecuta el método
 * main()) interrumpe el hilo MiThread llamando a elThread.interrupt().
 * 4. Cuando el hilo MiThread es interrumpido, el método Thread.interrupted()
 * devuelve true, y el bucle en MiThread se detiene. Se imprime "Termino" en la
 * consola.
 * 5. El hilo MiThread finaliza su ejecución.
 */
