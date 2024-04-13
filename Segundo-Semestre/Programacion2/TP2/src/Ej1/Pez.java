package Ej1;

public class Pez extends Animal{
    private String especie;

    public Pez(String nombre, int edad, String tipoAnimal, double precio, String especie) {
        super(nombre, edad, tipoAnimal, precio);
        this.especie = especie;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }
}
