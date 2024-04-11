package Ej9;

public class Rectangulo extends FiguraGeometrica{
    private float alto;
    private float ancho;

    public Rectangulo(float alto, float ancho) {
        this.alto = alto;
        this.ancho = ancho;
    }

    @Override
    public float area() {
        return  (ancho*alto);
    }

    @Override
    public float perimetro() {
        return (2*(ancho*alto));
    }
}
