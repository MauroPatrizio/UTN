package equipoIterator;

import java.util.ArrayList;
import java.util.Iterator;

public class Equipo implements Iterable{
    private ArrayList<Jugador> jugadores;

    public Equipo() {
        this.jugadores = new ArrayList<>();
    }

    public void agregarJugador(Jugador jugador){
        jugadores.add(jugador);
    }

    public ArrayList<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(ArrayList<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    @Override
    public Iterator<Jugador> iterator() {
        return new MiIterator();
    }

    private class MiIterator implements Iterator<Jugador>{
        private int indice = 0;
        @Override
        public boolean hasNext() {
            return indice < jugadores.size();
        }

        @Override
        public Jugador next() {
            return jugadores.get(indice++);
        }
    }

}
