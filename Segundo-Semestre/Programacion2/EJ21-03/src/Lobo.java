public class Lobo extends Canino{
    public Lobo(String foto, String comida, String localizacion, String size) {
        super(foto, comida, localizacion, size);
    }

    @Override
    public void comer() {
        System.out.println("El lobo come carne");
    }

    @Override
    public void hacerRuido() {
        System.out.println("El lobo hace ruido");
    }
}
