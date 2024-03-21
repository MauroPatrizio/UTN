public abstract class Animal {
    protected String foto, comida, localizacion, size;

    public Animal(String foto, String comida, String localizacion, String size) {
        this.foto = foto;
        this.comida = comida;
        this.localizacion = localizacion;
        this.size = size;
    }

    public abstract void hacerRuido();

    public abstract void comer();

    public void dormir() {
        System.out.println("El animal se durmió");
    }

    public abstract void rugir();
}
