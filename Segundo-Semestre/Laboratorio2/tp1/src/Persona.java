public abstract class Persona {
    protected   int  fechaNacimiento;
    protected   String nombre;

    public Persona(int fechaNacimiento, String nombre){
        this.fechaNacimiento=fechaNacimiento;
        this.nombre=nombre;
    }

    public int getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(int fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
