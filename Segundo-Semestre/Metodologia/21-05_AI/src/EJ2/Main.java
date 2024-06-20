package EJ2;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // Creación de objetos Hangar
        Hangar hangar1 = new Hangar(1, 10, "Ubicación A");
        Hangar hangar2 = new Hangar(2, 15, "Ubicación B");

        // Creación de objetos Persona
        Persona propietarioAvion = new Persona("123456789A", "Juan Pérez", "Calle Principal 123", "987654321");
        Mecanico mecanico = new Mecanico("987654321B", "María González", "Avenida Secundaria 456", "123456789", 2000, "Mañana", "Tipo1");
        Piloto piloto = new Piloto("567890123C", "Carlos Martínez", "Plaza Central 789", "456789012", 2500, "Tipo2");

        // Creación de objetos Avion
        Avion avion1 = new Avion("AV001", "MAT001", hangar1, new Date(), propietarioAvion);
        Avion avion2 = new Avion("AV002", "MAT002", hangar2, new Date(), propietarioAvion);

        // Creación de objetos TipoAvion
        TipoAvion tipoAvion1 = new TipoAvion("Modelo1", 200, 1500.0);
        TipoAvion tipoAvion2 = new TipoAvion("Modelo2", 150, 1200.0);

        // Creación de objetos Servicio
        Servicio servicio1 = new Servicio(new Date(), "Carga1");
        Servicio servicio2 = new Servicio(new Date(), "Carga2");

        // Pruebas de acceso a los datos
        System.out.println("Número de matrícula del avión 1: " + avion1.getNumeroMatricula());
        System.out.println("Capacidad del tipo de avión 2: " + tipoAvion2.getCapacidad());
        System.out.println("Ubicación del hangar 1: " + hangar1.getUbicacion());
        System.out.println("Nombre del propietario del avión 2: " + avion2.getPropietario().getNombre());
        System.out.println("Salario del mecánico: " + mecanico.getSalario());
        System.out.println("Tipo de avión autorizado del piloto: " + piloto.getTipoAvionAutorizado());
    }
}
