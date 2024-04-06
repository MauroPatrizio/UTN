package practicos.tp1.currentThread;

public class Main {
    public static void main(String[] args) {
        Cliente juan = new Cliente();
        juan.setName("Juan López");
        Cliente ines = new Cliente();
        ines.setName("Inés García");
        juan.start();
        ines.start();
    }
}

/**
 * El programa crea dos hilos (juan e ines) que comparten el método uso() de la
 * clase Recurso. Este método imprime el nombre del hilo actual. Al ser marcado
 * como synchronized, solo un hilo puede ejecutarlo a la vez, asegurando que los
 * nombres de los hilos se impriman de manera intercalada. Después de llamar al
 * método uso(), cada hilo espera durante 2 segundos antes de finalizar su
 * ejecución.
 */
