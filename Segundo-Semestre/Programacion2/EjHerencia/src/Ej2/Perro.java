package Ej2;

public class Perro extends Animal{
    private String raza;

    public Perro() {
    }

    public Perro(String name, int age, String gender, String raza) {
        super(name, age, gender);
        this.raza = raza;
    }

    public void informacion() {
        System.out.println("Perro, " +
                "raza: " + raza +
                ", name: " + name +
                ", age: " + age +
                ", gender: " + gender );
    }

    @Override
    public void hacer_sonido() {
        System.out.println("El perro ladra");
    }
}
