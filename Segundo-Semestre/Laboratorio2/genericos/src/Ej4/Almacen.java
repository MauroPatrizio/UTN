package Ej4;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Almacen<T>{

    List<T> productos;

    public Almacen() {
        this.productos = new ArrayList<>();
    }

    public void agregarProducto(T producto) {
        productos.add(producto);
    }

    public void imprimirProductos(List<? super T> productos) {
        for (Object producto : productos) {
            System.out.println(producto);
        }
    }
}
