package practicos.tp1.isAlive;

public class Ejemplo_isAlive {
    public static void main(String[] args) {
        Obrera agente = new Obrera();
        agente.start();
        // Hace algo durante el cálculo.

        //Espera que agente haya terminado
        while (agente.isAlive())
            Thread.yield();
        // Utiliza el resultado.
        System.out.println(agente.getResultado());
    }
}

/**
 * El código presenta una clase Obrera que extiende la clase Thread. Esta clase
 * realiza un cálculo largo en el método calcula(), que simula tomar 10 segundos
 * en completarse. Durante la ejecución de este cálculo, el hilo principal
 * continúa con sus tareas.
 * El método getResultado() devuelve el resultado del cálculo, que inicialmente
 * está marcado como "No calculado". Una vez que el cálculo finaliza, este
 * resultado se actualiza a "Ya calculado".
 */
