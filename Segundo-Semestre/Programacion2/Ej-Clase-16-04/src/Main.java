import equipoIterator.Equipo;
import equipoIterator.Jugador;

public class Main {
    public static void main(String[] args) {
        Jugador jugador1 = new Jugador("Marcos", "Delantero", 9);
        Jugador jugador2 = new Jugador("Julio", "Mediocampo", 5);
        Jugador jugador3 = new Jugador("Pedro", "Defensa", 2);
        Jugador jugador4 = new Jugador("Oscar", "Arquero", 1);
        Equipo equipo1 = new Equipo();

        equipo1.agregarJugador(jugador1);
        equipo1.agregarJugador(jugador2);
        equipo1.agregarJugador(jugador3);
        equipo1.agregarJugador(jugador4);

        for (Jugador jugador : equipo1.getJugadores()) {
            System.out.println("Nombre: " + jugador.getNombre() + ", Posición: " + jugador.getPosicion() + " ,Número de camiseta: " + jugador.getNumero());
        }
    }
}