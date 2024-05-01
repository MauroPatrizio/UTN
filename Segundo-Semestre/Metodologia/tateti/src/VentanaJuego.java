import javax.swing.*;
import java.awt.*;

class VentanaJuego extends JPanel {

    private Tablero tablero;
    private GridLayout layoutTablero;

    public VentanaJuego(Tablero tablero) {
        this.tablero = tablero;

        // Check if tablero is null before calling getTamTablero()
        if (tablero != null) {
            layoutTablero = new GridLayout(tablero.getTamTablero(), tablero.getTamTablero());
        } else {
            // Handle null tablero case (optional: throw an exception or use a default size)
            System.err.println("Error: Tablero object is null in VentanaJuego constructor.");
        }
        this.setLayout(layoutTablero);

        for (int fila = 0; fila < (tablero != null ? tablero.getTamTablero() : 3); fila++) {
            for (int columna = 0; columna < (tablero != null ? tablero.getTamTablero() : 3); columna++) {
                JButton boton = tablero.getBotones()[fila][columna];
                boton.addActionListener(tablero);
                this.add(boton);
            }
        }
    }
}
