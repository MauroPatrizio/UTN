import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Vehicle> vehiculos = new ArrayList<>();
        Car coche = new Car(150, 200);
        Van camioneta = new Van(50, 200, 100);
        Bicycle bicicleta = new Bicycle("urbana");
        Motorcycle moto = new Motorcycle(100, 120);

        vehiculos.add(coche);
        vehiculos.add(camioneta);
        vehiculos.add(bicicleta);
        vehiculos.add(moto);



        catalogar(vehiculos);
    }

    public static void catalogar(List<Vehicle> vehiculos) {
        for (Vehicle vehiculo : vehiculos) {
            System.out.println(vehiculo.toString());
        }
    }
}