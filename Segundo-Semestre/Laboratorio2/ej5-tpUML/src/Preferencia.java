public class Preferencia {
    private Persona persona;
    private Plato plato;
    private Restaurante restaurante;
    private boolean gusta;

    public Preferencia(Persona persona, Plato plato, Restaurante restaurante, boolean gusta) {
        this.persona = persona;
        this.plato = plato;
        this.restaurante = restaurante;
        this.gusta = gusta;
    }
}
