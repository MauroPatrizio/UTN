package Ej1;

public class Cuadrado implements Rotable, Figura, Dibujable{
    @Override
    public void dibujar() {
        System.out.println("Se dibujó un cuadrado");
    }

    @Override
    public void area(float lado) {
        System.out.println("El área de un cuadrado es " + (lado*lado));

    }

    @Override
    public void rotar(float grados) {
        System.out.println("El cuadrado se rotó " + grados + " grados");
    }
}
