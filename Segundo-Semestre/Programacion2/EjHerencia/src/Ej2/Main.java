package Ej2;

public class Main {
    public static void main(String[] args) {
        Perro perro = new Perro("Ruperto", 5, "macho", "Dogo Argentino");
        Gato gato = new Gato("Michi", 2, "Hembra", "Blanco");
        Pajaro pajaro = new Pajaro("Plumita", 1, "Hembra", "Azulejo");

        perro.hacer_sonido();
        perro.informacion();
        gato.hacer_sonido();
        gato.informacion();
        pajaro.hacer_sonido();
        pajaro.informacion();
    }
}
