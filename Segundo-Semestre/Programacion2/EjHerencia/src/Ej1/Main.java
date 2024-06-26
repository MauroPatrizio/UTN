package Ej1;

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
        catalogar(vehiculos, 2);
        catalogar(vehiculos, 4);
    }
    public static void catalogar(List<Vehicle> vehiculos){
        catalogar(vehiculos, 0);
    }
    public static void catalogar(List<Vehicle> vehiculos, int ruedas) {
        int qty = 0;
        if(ruedas > 0){
            for (Vehicle vehiculo: vehiculos){
                if (vehiculo.getWheels() == ruedas){
                    System.out.println(vehiculo.toString());
                    qty++;
                }
            }
            System.out.println("Se han encontrado " + qty + " vehículos con " + ruedas + " ruedas.");
        } else {
            for (Vehicle vehiculo : vehiculos) {
                System.out.println(vehiculo.toString());
                qty++;
            }
        }
    }

}
