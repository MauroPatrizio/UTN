import java.util.ArrayList;

/*2.	Define una clase EquipoDeFútbol que utiliza un ArrayList para mantener una lista de jugadores.
        La clase debe permitir agregar nuevos jugadores, eliminar jugadores y listar la plantilla.*/
public class EquipoDeFutbol {
    private static ArrayList<String> equipo = new ArrayList<>();

    public EquipoDeFutbol() {
    }

    public void addPlayer(String player){
        equipo.add(player.trim());
    }

    public void removePlayer(String player){
        if (equipo.contains(player)){
            equipo.remove(player);
        } else {
            System.out.println("Player not found");
        }
    }

    @Override
    public String toString() {
        return "EquipoDeFutbol{" +
                "equipo=" + equipo +
                '}';
    }
}
