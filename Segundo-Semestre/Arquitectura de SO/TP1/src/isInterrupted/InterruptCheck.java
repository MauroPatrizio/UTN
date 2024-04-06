package practicos.tp1.isInterrupted;

public class InterruptCheck {
    public static void main(String[] args) {
        Thread t = Thread.currentThread();
        System.out.println("A:t.isInterrupted()=" + t.isInterrupted());
        t.interrupt();
        System.out.println("B:t.isInterrupted()=" + t.isInterrupted());
        System.out.println("C:t.isInterrupted()=" + t.isInterrupted());
        try {
            Thread.sleep(2000);
            System.out.println("No ha sido interrumpida");
        } catch (InterruptedException e) {
            System.out.println("Si ha sido interrumpida");
        }
        System.out.println("D:t.isInterrupted()=" + t.isInterrupted());
    }
}

/**
 * 1. Se obtiene una referencia al hilo actual utilizando Thread.currentThread().
 * 2. Se imprime el resultado de t.isInterrupted() antes de llamar a interrupt().
 * Esto mostrará "false".
 * 3. Se llama al método interrupt() en el hilo actual.
 * 4. Se imprime el resultado de t.isInterrupted() después de llamar a
 * interrupt().
 * Esto mostrará true, indicando que el hilo ha sido interrumpido.
 * 5. Se imprime nuevamente el resultado de t.isInterrupted(). Esto mostrará true
 * nuevamente, ya que el hilo sigue estando interrumpido.
 * 6. Se intenta dormir el hilo actual durante 2 segundos con Thread.sleep(2000).
 * 7. Si el hilo es interrumpido mientras está dormido, se lanzará una excepción
 * InterruptedException y se imprimirá "Si ha sido interrumpida".
 * 8. Finalmente, se imprime el resultado de t.isInterrupted() nuevamente. Si el
 * hilo fue interrumpido durante el sueño, mostrará true; de lo contrario,
 * mostrará false.
 */
