package Ej2;

public abstract class Libro implements Prestable{
    protected String titulo;
    protected String autor;
    protected int añoDePublicacion;
    protected boolean prestado;

    public Libro(String titulo, String autor, int añoDePublicacion, boolean prestado) {
        this.titulo = titulo;
        this.autor = autor;
        this.añoDePublicacion = añoDePublicacion;
        this.prestado = prestado;
    }

    @Override
    public void prestar() {
        if (!prestado) {
            System.out.println("El libro " + titulo + " ha sido prestado");
            prestado = true;
        } else {
            System.out.println("El libro " + titulo + " no está disponible para prestar en este momento");
        }
    }

    @Override
    public void devolver() {
        if (prestado) {
            System.out.println("El libro " + titulo + " ha sido devuelto");
            prestado = false;
        } else {
            System.out.println("El libro " + titulo + " sigue en inventario, por lo tanto no es de esta biblioteca");
        }
    }
}
