package Ej10;

public class Novela extends Libro{
    private TipoNovela tipoNovela;

    public Novela(String titulo, String autor, float precio, TipoNovela tipoNovela) {
        super(titulo, autor, precio);
        this.tipoNovela = tipoNovela;
    }
    @Override
    public void imprimirPantalla(){
        System.out.println("Titulo:" + titulo + "\nAutor: " + autor + "\nPrecio: " + precio + "Tipo de novela: " + tipoNovela);
    }
}
