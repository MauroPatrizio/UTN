import java.util.ArrayList;

public class EquipoDeFutbol {
    private ArrayList<String> jugadores = new ArrayList<String>();

    public EquipoDeFutbol(ArrayList<String> jugadores) {
        this.jugadores = jugadores;
    }

    public ArrayList<String> getJugadores() {
        return jugadores;
    }

    public void setJugadores(ArrayList<String> jugadores) {
        this.jugadores = jugadores;
    }

    @Override
    public String toString() {
        return "EquipoDeFutbol{" +
                "jugadores=" + jugadores +
                '}';
    }
}

