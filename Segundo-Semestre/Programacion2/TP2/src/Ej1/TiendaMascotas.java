package Ej1;

import java.util.ArrayList;
import java.util.List;

public class TiendaMascotas{
    private List<Animal> animales;

    public TiendaMascotas(){
        this.animales = new ArrayList<>();
    }
    public void addAnimal(Animal animal){
        animales.add(animal);
    }

    public void venderAnimal(String nombre) {
        for (Animal animal : animales) {
            if (animal.toString().contains(nombre)) {
                animales.remove(animal);
                System.out.println(nombre + " fue vendido.");
                return;
            }
        }
        System.out.println("No hay animal con el nombre " + nombre);
    }

    public void alimentarAnimal(String nombre) {
        for (Animal animal : animales) {
            if (animal.toString().contains(nombre)) {
                animal.alimentar();
                return;
            }
        }
        System.out.println("No se encontró ningún animal con el nombre " + nombre);
    }

    public void listarAnimales() {
        System.out.println("Animales en la tienda:");
        for (Animal animal : animales) {
            System.out.println(animal);
        }
    }
}
