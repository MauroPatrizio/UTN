import java.util.HashMap;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       /* EquipoDeFutbol equipo = new EquipoDeFutbol();
        equipo.addPlayer("mauro");
        equipo.addPlayer("pablo");
        equipo.addPlayer("marcos");
        equipo.removePlayer("mauro");
        System.out.println(equipo.toString());*/

        Factura f1 = new Factura("Mauro");
        System.out.println(f1.toString());

    }
}
