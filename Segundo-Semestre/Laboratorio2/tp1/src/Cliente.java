import java.util.ArrayList;

public class Cliente  extends  Persona {
    private int codCliente ;
    private ArrayList<Reserva> reservas = new ArrayList<>() ;

    public Cliente(int fechaNacimiento, String nombre, int codCliente) {
        super(fechaNacimiento, nombre);
        this.codCliente = codCliente;

    }

    public int getCodCliente() {
        return codCliente;
    }

    public void setCodCliente(int codCliente) {
        this.codCliente = codCliente;
    }

    public ArrayList<Reserva> getReservas() {
        return reservas;
    }

    public void setReservas(ArrayList<Reserva> reservas) {
        this.reservas = reservas;
    }
}
