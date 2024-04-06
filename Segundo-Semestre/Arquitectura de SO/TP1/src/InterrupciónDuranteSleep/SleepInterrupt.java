package practicos.tp1.InterrupciónDuranteSleep;

public class SleepInterrupt implements Runnable {
    public void run() {
        try {
            System.out.println("in run(): me duermo 20 s");
            Thread.sleep(20000);
            System.out.println("in run(): me despierto");
        } catch (InterruptedException e) {
            System.out.println("in run(): interrumpida en sleep");
            return;
        }
        System.out.println("in run(): fin normal");
    }

    public static void main(String[] args) {
        SleepInterrupt si = new SleepInterrupt();
        Thread t = new Thread(si);
        t.start();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
        }
        ;
        System.out.println("in main(): Intterupo a t");
        t.interrupt();
        System.out.println("in main(): termina");
    }
}

/**
 * 1. Se crea una instancia de SleepInterrupt y se envuelve en un hilo t.
 * 2. El hilo t comienza a ejecutar su método run().
 * 3. Dentro de run(), se imprime "in run(): me duermo 20 s" y el hilo intenta
 * dormir durante 20 segundos.
 * 4. Después de aproximadamente 1000 milisegundos, el hilo principal interrumpe
 * el hilo t llamando a t.interrupt().
 * 5. El hilo t maneja la interrupción, imprime "in run(): interrumpida en sleep"
 * y luego finaliza su ejecución normalmente.
 * 6. Después de interrumpir el hilo t, el hilo principal imprime "in main():
 * termina".
 */
