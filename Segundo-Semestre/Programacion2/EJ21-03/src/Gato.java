public class Gato extends Felino {

    public Gato(String foto, String comida, String localizacion, String size) {
        super(foto, comida, localizacion, size);
    }

    @Override
    public void comer() {
        System.out.println("El gato come alimento y pescado");    }

    @Override
    public void hacerRuido() {
        System.out.println("El gato hace ruido");
    }

    public void vacunar(){
        System.out.println("El gato se vacunó");
    }
}
