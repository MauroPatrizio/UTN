package Ej3;

public class Triangle {
    private double base;
    private double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    public void area(){
        System.out.println("The area of the triangle is: " + ((base*height)/2));
    }
}
