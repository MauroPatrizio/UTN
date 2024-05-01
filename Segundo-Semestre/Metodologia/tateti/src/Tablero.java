import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Tablero implements ActionListener {

    private static final int TAM_TABLERO = 3; // Tamaño del tablero (3x3)
    private static final String JUGADOR_X = "X"; // Valor para el jugador X
    private static final String JUGADOR_O = "O"; // Valor para el jugador O
    private static final Color COLOR_X = Color.RED; // Color para las X
    private static final Color COLOR_O = Color.BLUE; // Color para las O

    private JButton[][] botones;
    private String turnoActual;
    private boolean juegoTerminado;

    public Tablero() {
        botones = new JButton[TAM_TABLERO][TAM_TABLERO];
        for (int fila = 0; fila < TAM_TABLERO; fila++) {
            for (int columna = 0; columna < TAM_TABLERO; columna++) {
                botones[fila][columna] = new JButton();
                botones[fila][columna].setFont(new Font("Arial", Font.BOLD, 40));
            }
        }
        turnoActual = JUGADOR_X;
        juegoTerminado = false;
    }

    public void marcarCasilla(JButton boton) {
        if (boton.getText().isEmpty() && !juegoTerminado) {
            boton.setText(turnoActual);
            boton.setForeground(turnoActual.equals(JUGADOR_X) ? COLOR_X : COLOR_O);
            turnoActual = (turnoActual.equals(JUGADOR_X) ? JUGADOR_O : JUGADOR_X);
        }
    }

    private boolean esIgual(String s1, String s2, String s3) {
        return s1.equals(s2) && s2.equals(s3) && !s1.isEmpty();
    }

    // New method to check equality of button text
    private boolean botonesIguales(JButton boton1, JButton boton2) {
        return boton1.getText().equals(boton2.getText());
    }

    public boolean hayGanador() {
        // Verificar filas y columnas
        for (int i = 0; i < TAM_TABLERO; i++) {
            if (esIgual(botones[i][0].getText(), botones[i][1].getText(), botones[i][2].getText())
                    && !botones[i][0].getText().isEmpty()) {
                return true;
            }
            if (botonesIguales(botones[0][i], botones[1][i]) && botonesIguales(botones[1][i], botones[2][i])
                    && !botones[0][i].getText().isEmpty()) {
                return true;
            }
        }

        // Verificar diagonales
        if (esIgual(botones[0][0].getText(), botones[1][1].getText(), String.valueOf(botones[2][2]))
                && !botones[0][0].getText().isEmpty()) {
            return true;
        }
        if (esIgual(botones[0][2].getText(), botones[1][1].getText(), String.valueOf(botones[2][0]))
                && !botones[0][2].getText().isEmpty()) {
            return true;
        }

        return false;
    }

    public boolean esEmpate() {
        for (int fila = 0; fila < TAM_TABLERO; fila++) {
            for (int columna = 0; columna < TAM_TABLERO; columna++) {
                if (botones[fila][columna].getText().isEmpty()) {
                    return false;
                }
            }
        }
        return true;
    }

    public String getTurnoActual() {
        return turnoActual;
    }

    public void setTurnoActual(String turnoActual) {
        this.turnoActual = turnoActual;
    }

    public void setJuegoTerminado(boolean juegoTerminado) {
        this.juegoTerminado = juegoTerminado;
    }

    public JButton[][] getBotones() {
        return botones;
    }

    public int getTamTablero() {
        return TAM_TABLERO;
    }

    public void cambiarTurno() {
        turnoActual = (turnoActual.equals(JUGADOR_X) ? JUGADOR_O : JUGADOR_X);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }

}
