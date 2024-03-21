public class Tigre extends Felino {

    public Tigre(String foto, String comida, String localizacion, String size) {
        super(foto, comida, localizacion, size);
    }

    @Override
    public void comer() {
        System.out.println("El tigre come carne");
    }

    @Override
    public void hacerRuido() {
        System.out.println("El tigre hace ruido");
    }
}
