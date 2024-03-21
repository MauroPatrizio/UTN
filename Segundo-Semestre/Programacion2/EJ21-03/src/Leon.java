public class Leon extends Felino{
    public Leon(String foto, String comida, String localizacion, String size) {
        super(foto, comida, localizacion, size);
    }

    @Override
    public void comer() {
        System.out.println("El leon come carne");
    }

    @Override
    public void hacerRuido() {
        System.out.println("El leon hace ruido");
    }
}
