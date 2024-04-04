import Ej1.Circulo;
import Ej1.Cuadrado;

public class Main {
    public static void main(String[] args) {
        Circulo cir = new Circulo();
        Cuadrado cua = new Cuadrado();
        cua.dibujar();
        cua.area(12);
        cua.rotar(36);
        cir.dibujar();
        cir.area(12);
    }
}