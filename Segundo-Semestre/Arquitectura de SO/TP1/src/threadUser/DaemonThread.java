package practicos.tp1.threadUser;

public class DaemonThread implements Runnable {
    public void run() {
        System.out.println("Comienza run()");
        try {
            while (true) {
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                }
                System.out.println("run() ha despertado");
            }
        } finally {
            System.out.println("Termina run()");
        }
    }

    public static void main(String[] args) {
        System.out.println("Comienza main()");
        Thread t = new Thread(new DaemonThread());
        t.setDaemon(true);
        t.start();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
        }
        System.out.println("Termina main()");
    }
}

/**
 * 1. La clase DaemonThread implementa la interfaz Runnable y sobrescribe el
 * método run(). Dentro de este método, hay un bucle while infinito que duerme el
 * hilo durante 500 milisegundos en cada iteración utilizando Thread.sleep(500).
 * Después de despertar del sueño, se imprime "run() ha despertado". Este bucle
 * se ejecuta continuamente hasta que el hilo es interrumpido.
 * 2. En el método main(), se crea una instancia de DaemonThread y se envuelve
 * en un nuevo hilo t. Antes de iniciar el hilo, se establece como un hilo
 * demonio utilizando t.setDaemon(true). Los hilos demonio son hilos que se
 * ejecutan en segundo plano y no impiden que el programa finalice si todos
 * los hilos normales ya han terminado su ejecución.
 * 3. El hilo t se inicia y comienza a ejecutar su método run() en segundo
 * plano.
 * 4. Después de iniciar el hilo, el hilo principal (el hilo que ejecuta el
 * método main()) se duerme durante 2000 milisegundos utilizando Thread.sleep
 * (2000).
 * 5. Cuando el tiempo de espera del hilo principal termina, se imprime "Termina
 * main()" y el programa finaliza su ejecución.
 */
