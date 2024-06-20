package EJ2;
class TipoAvion {
    private String modelo;
    private int capacidad;
    private double peso;

    public TipoAvion(String modelo, int capacidad, double peso) {
        this.modelo = modelo;
        this.capacidad = capacidad;
        this.peso = peso;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
}