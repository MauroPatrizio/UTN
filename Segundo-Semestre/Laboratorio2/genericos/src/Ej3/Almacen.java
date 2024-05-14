package Ej3;

import java.util.ArrayList;
import java.util.List;

public class Almacen {
    private List<Producto> productos;

    public Almacen(){
        this.productos = new ArrayList<Producto>();
    }

    public void agregarProducto(Producto producto){
        productos.add(producto);
    }

    public void imprimirProductos(){
        for(Producto producto: productos){
            System.out.println(producto);
        }
    }
}
