package Ej2;

public class Animal {
    protected String name;
    protected int age;
    protected String gender;

    public Animal() {
    }

    public Animal(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public void hacer_sonido(){
        System.out.println("El animal hace un sonido genérico");
    };
}
