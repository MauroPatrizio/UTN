public abstract class Canino extends Animal{
    public Canino(String foto, String comida, String localizacion, String size) {
        super(foto, comida, localizacion, size);
    }

    @Override
    public void rugir() {
        System.out.println("El canino ruge");
    }

}
