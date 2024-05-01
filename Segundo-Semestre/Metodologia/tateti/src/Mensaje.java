import javax.swing.*;
import java.awt.*;

class Mensaje extends JPanel {

    private JLabel etiquetaMensaje;

    public Mensaje() {
        super();
        etiquetaMensaje = new JLabel("Turno: X", JLabel.CENTER); // Mensaje inicial indicando el turno X
        etiquetaMensaje.setFont(new Font("Arial", Font.BOLD, 20));
        add(etiquetaMensaje);
    }

    public void mostrarMensaje(String mensaje) {
        etiquetaMensaje.setText(mensaje);
    }
}
