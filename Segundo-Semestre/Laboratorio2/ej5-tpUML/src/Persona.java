import java.util.List;

public class Persona {
    private String nombre;
    private List<Preferencia> preferencias;

    public Persona(String nombre) {
        this.nombre = nombre;
        this.preferencias = new ArrayList<>();
    }

    public void agregarPreferencia(Preferencia preferencia) {
        preferencias.add(preferencia);
    }
}
