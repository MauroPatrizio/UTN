package practicos.tp1.threadAutoLanzado;

public class SelfRun implements Runnable {
    private final Thread internalThread;
    private boolean noStopRequired;

    public SelfRun() {
        System.out.println("Comienza ejecución");
        noStopRequired = true;
        internalThread = new Thread(this);
        internalThread.start();
    }

    public static void main(String[] args) {
        SelfRun objActivo = new SelfRun();
        // Espera durante 2 segundos
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
        }
        // Termina el objeto activo
        System.out.println("main invoca stopRequest()");
        objActivo.stopRequest();
    }

    public void run() {
        while (noStopRequired) {
            System.out.println("En ejecución");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public void stopRequest() {
        noStopRequired = false;
        internalThread.interrupt();
    }
}

/**
 * El programa crea un hilo secundario que se ejecuta de forma concurrente con
 * el hilo principal. Este hilo secundario ejecuta un bucle infinito en el que
 * imprime repetidamente "En ejecución" en la consola con un retraso de 500
 * milisegundos entre cada impresión. Mientras tanto, el hilo principal espera
 * durante 2 segundos antes de solicitar explícitamente que el hilo secundario se
 * detenga. Cuando se realiza esta solicitud, el hilo secundario se interrumpe y
 * finaliza su ejecución.
 */
