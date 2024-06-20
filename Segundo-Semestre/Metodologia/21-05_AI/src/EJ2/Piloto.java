package EJ2;
class Piloto extends Persona {
    private double salario;
    private String tipoAvionAutorizado;

    public Piloto(String dni, String nombre, String direccion, String telefono, double salario, String tipoAvionAutorizado) {
        super(dni, nombre, direccion, telefono);
        this.salario = salario;
        this.tipoAvionAutorizado = tipoAvionAutorizado;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getTipoAvionAutorizado() {
        return tipoAvionAutorizado;
    }

    public void setTipoAvionAutorizado(String tipoAvionAutorizado) {
        this.tipoAvionAutorizado = tipoAvionAutorizado;
    }
}