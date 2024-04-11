package Ej9;

public class Circulo extends FiguraGeometrica{

    private float radio;

    public Circulo(float radio) {
        this.radio = radio;
    }

    @Override
    public float area() {
        return (float) (Math.PI*Math.pow(radio, 2));
    }

    @Override
    public float perimetro() {
        return (float) (2 * Math.PI * radio);
    }
}
