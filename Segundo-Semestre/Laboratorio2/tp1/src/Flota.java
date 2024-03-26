import java.util.ArrayList;

public class Flota {

   private String ubicacion;
    private ArrayList<Avion>  aviones= new ArrayList<>();

    public Flota(String ubicacion) {
        this.ubicacion = ubicacion;
        this.aviones= new ArrayList<>();
    }


    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }




    public void addAviones(Avion avion){
        aviones.add(avion);
    }
    public void mostrarAviones(){
        System.out.println("Los aviones de la Flota  son ");
        System.out.println(aviones);
    }
}
