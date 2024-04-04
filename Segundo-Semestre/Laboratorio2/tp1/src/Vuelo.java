public class Vuelo {
    private int capacidadDisponible;
    private int codVuelo;

    private Avion avion;

    public Vuelo(int capacidadDisponible, int codVuelo) {
        this.capacidadDisponible = capacidadDisponible;
        this.codVuelo = codVuelo;

    }

    public int getCapacidadDisponible() {
        return capacidadDisponible;
    }

    public void setCapacidadDisponible(int capacidadDisponible) {
        this.capacidadDisponible = capacidadDisponible;
    }

    public int getCodVuelo() {
        return codVuelo;
    }

    public void setCodVuelo(int codVuelo) {
        this.codVuelo = codVuelo;
    }

    public Avion getAvion() {
        return avion;
    }

    public void setAvion(Avion avion) {
        this.avion = avion;
    }
}
