package Ej2;

public class Gato extends Animal {
    private String color;

    public Gato() {
    }

    public Gato(String name, int age, String gender, String color) {
        super(name, age, gender);
        this.color = color;
    }


    public void informacion() {
        System.out.println("Gato, " +
                "color: " + color +
                ", name: " + name +
                ", age: " + age +
                ", gender: " + gender);
    }

    @Override
    public void hacer_sonido() {
        System.out.println("El gato maulla");
    }
}
