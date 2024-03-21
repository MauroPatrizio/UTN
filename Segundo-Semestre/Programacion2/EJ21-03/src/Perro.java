public class Perro extends Canino {
    public Perro(String foto, String comida, String localizacion, String size) {
        super(foto, comida, localizacion, size);
    }

    @Override
    public void comer() {
        System.out.println("El perro come alimento");
    }

    @Override
    public void hacerRuido() {
        System.out.println("El perro hace ruido");
    }
    public void vacunar(){
        System.out.println("El perro se vacunó");
    }
    public void sacarPaseo(){
        System.out.println("Sacamos a pasear al perro");
    }
}
