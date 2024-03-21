public abstract class Felino extends Animal{
    public Felino(String foto, String comida, String localizacion, String size) {
        super(foto, comida, localizacion, size);
    }

    @Override
    public void rugir() {
        System.out.println("El felino ruge");
    }
}
