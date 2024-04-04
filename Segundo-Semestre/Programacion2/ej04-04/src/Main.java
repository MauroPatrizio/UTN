import Ej1.Circulo;
import Ej1.Cuadrado;
import Ej2.Mage;
import Ej2.Rogue;
import Ej2.Warrior;

public class Main {
    public static void main(String[] args) {
        Circulo cir = new Circulo();
        Cuadrado cua = new Cuadrado();
        cua.dibujar();
        cua.area(12);
        cua.rotar(36);
        cir.dibujar();
        cir.area(12);
        Warrior war = new Warrior("Coso");
        Rogue rog = new Rogue("Daguita");
        Mage mag = new Mage("Staff");
    }
}