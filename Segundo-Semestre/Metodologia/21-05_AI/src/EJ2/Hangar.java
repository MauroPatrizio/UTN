package EJ2;
class Hangar {
    private int id;
    private int capacidad;
    private String ubicacion;

    public Hangar(int id, int capacidad, String ubicacion) {
        this.id = id;
        this.capacidad = capacidad;
        this.ubicacion = ubicacion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }
}