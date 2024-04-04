package Ej1;

public class Circulo implements Figura, Dibujable{
    @Override
    public void dibujar() {
        System.out.println("El circulo se puede dibujar");
    }

    @Override
    public void area(float radio) {
        System.out.println("El área de un círculo es " + (float) (Math.PI*radio*radio));
    }
}
