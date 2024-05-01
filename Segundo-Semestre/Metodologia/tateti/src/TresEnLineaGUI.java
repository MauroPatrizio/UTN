import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class TresEnLineaGUI extends JFrame implements ActionListener {

    private static final int TAM_TABLERO = 3; // Tamaño del tablero (3x3)
    private static final String JUGADOR_X = "X"; // Valor para el jugador X
    private static final String JUGADOR_O = "O"; // Valor para el jugador O
    private static final Color COLOR_X = Color.RED; // Color para las X
    private static final Color COLOR_O = Color.BLUE; // Color para las O

    private Tablero tablero;
    private VentanaJuego ventanaJuego;
    private Mensaje mensaje;

    public TresEnLineaGUI() {
        super("Tres en Línea"); // Título de la ventana

        // Crear tablero
        tablero = new Tablero();

        // Crear ventana de juego
        ventanaJuego = new VentanaJuego(tablero);

        // Crear mensaje
        mensaje = new Mensaje();

        // Agregar componentes a la ventana principal
        getContentPane().setLayout(new BorderLayout());
        getContentPane().add(ventanaJuego, BorderLayout.CENTER);
        getContentPane().add(mensaje, BorderLayout.SOUTH);

        // Configurar ventana
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 300);
        setResizable(false);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        tablero.marcarCasilla((JButton) e.getSource());

        if (tablero.hayGanador()) {
            mensaje.mostrarMensaje("¡Ganó el jugador " + tablero.getTurnoActual() + "!");
            tablero.setJuegoTerminado(true);
        } else if (tablero.esEmpate()) {
            mensaje.mostrarMensaje("¡Empate!");
            tablero.setJuegoTerminado(true);
        } else {
            tablero.cambiarTurno();
            mensaje.mostrarMensaje("Turno: " + tablero.getTurnoActual());
        }
    }

    public static void main(String[] args) {
        new TresEnLineaGUI();
    }
}
