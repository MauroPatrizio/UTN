package Ej2;

public class Pajaro extends Animal {
    private String especie;

    public Pajaro() {
    }

    public Pajaro(String name, int age, String gender, String especie) {
        super(name, age, gender);
        this.especie = especie;
    }

    public void informacion() {
        System.out.println("Pajaro, " +
                "especie: " + especie +
                ", name: " + name +
                ", age: " + age +
                ", gender: " + gender );
    }

    @Override
    public void hacer_sonido() {
        System.out.println("El pájaro trina");
    }
}
