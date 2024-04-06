package practicos.tp1.interruptEinterrupted;

public class MiThread extends Thread {
    public void run() {
        while (!Thread.interrupted()) {
            System.out.println("Ejecuto");
        }
        System.out.println("Termino");
        return;
    }
}
