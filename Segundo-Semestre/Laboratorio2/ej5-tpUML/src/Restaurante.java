import java.util.List;

public class Restaurante {
    private String nombre;
    private List<Sucursal> sucursales;
    private List<Plato> platos;

    public Restaurante(String nombre, List<Sucursal> sucursales, List<Plato> platos) {
        this.nombre = nombre;
        this.sucursales = sucursales;
        this.platos = platos;
    }

    public void agregarSucursal(Sucursal sucursal){
        sucursales.add(sucursal);
    }

    public void ofrecerPlato(Plato plato){
        if(platos.size()<20) {
            platos.add(plato);
        } else {
            System.out.println("Error al cargar - Ya tiene 20 platos");
        }
    }
}
