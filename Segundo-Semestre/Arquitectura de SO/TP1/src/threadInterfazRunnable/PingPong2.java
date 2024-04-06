package practicos.tp1.threadInterfazRunnable;

import static java.lang.Thread.sleep;

public class PingPong2 implements Runnable {
    private final String word; // Lo que va a escribir

    private final int delay; // Tiempo entre escrituras

    public PingPong2(String queDecir, int cadaCuantosMs) {
        word = queDecir;
        delay = cadaCuantosMs;
    }


    public void run() {
        while (true) {
            System.out.print(word + " ");
            try {
                sleep(delay);
            } catch (InterruptedException e) {
                return;
            }
        }
    }
}
