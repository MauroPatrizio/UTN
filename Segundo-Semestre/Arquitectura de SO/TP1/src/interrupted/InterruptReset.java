package practicos.tp1.interrupted;

public class InterruptReset {
    public static void main(String[] args) {
        Thread t = Thread.currentThread();
        System.out.println("A: Thread.interrupted()=" + Thread.interrupted());
        t.interrupt();
        System.out.println("B: Thread.interrupted()=" + Thread.interrupted());
        System.out.println("C: Thread.interrupted()=" + Thread.interrupted());
        try {
            Thread.sleep(2000);
            System.out.println("No ha sido interrumpida");
        } catch (InterruptedException e) {
            System.out.println("Si ha sido interrumpida");
        }
        System.out.println("D: t.isInterrupted()=" + t.isInterrupted());
    }
}

/**
 * 1. Se obtiene una referencia al hilo actual utilizando Thread.currentThread().
 * 2. Se llama a Thread.interrupted() para verificar si el hilo actual ha sido
 * interrumpido. Inicialmente, esto devolverá false.
 * 3. Se llama al método interrupt() en el hilo actual para marcarlo como
 * interrumpido.
 * 4. Se llama nuevamente a Thread.interrupted(). Esto devolverá true, indicando
 * que el hilo ha sido interrumpido, y además limpiará el estado de
 * interrupción del hilo, estableciéndolo de nuevo a false.
 * 5. Se llama una vez más a Thread.interrupted(). Esto devolverá false, ya
 * que el estado de interrupción del hilo ha sido reiniciado.
 * 6. Se intenta dormir el hilo actual durante 2 segundos con Thread.sleep(2000).
 * 7. Si el hilo es interrumpido mientras está dormido, se lanzará una excepción
 * InterruptedException y se imprimirá "Si ha sido interrumpida".
 * 8. Finalmente, se imprime el resultado de t.isInterrupted(). Esto mostrará
 * true si el hilo fue interrumpido mientras estaba dormido, o false si no fue
 * interrumpido.
 */
