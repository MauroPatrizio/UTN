package Ej1;

public class Main {
    public static void main(String[] args) {
        // Crear instancias de ciudades
        Ciudad ciudad1 = new Ciudad("Ciudad1", 50000, 10000, 20000, 15000, 5000, 3000, 60000);
        Ciudad ciudad2 = new Ciudad("Ciudad2", 70000, 20000, 25000, 18000, 7000, 4000, 80000);
        Ciudad ciudad3 = new Ciudad("Ciudad3", 30000, 5000, 8000, 6000, 2000, 1000, 25000);

        // Crear instancia de provincia
        Pais pais = new Pais("PaisEjemplo", "CapitalPais", "ContinenteEjemplo");
        Provincia provincia = new Provincia("ProvinciaEjemplo", "CapitalProvincia", pais);

        // Agregar ciudades a la provincia
        provincia.agregarCiudad(ciudad1);
        provincia.agregarCiudad(ciudad2);
        provincia.agregarCiudad(ciudad3);

        // Agregar provincia al país
        pais.agregarProvincia(provincia);

        // Verificar ciudades con déficit
        System.out.println("Ciudades con déficit:");
        for (Ciudad ciudad : pais.getCiudadesConDeficit()) {
            System.out.println(ciudad.getNombre());
        }

        // Verificar provincias con mayoría de ciudades en déficit
        System.out.println("Provincias con mayoría de ciudades en déficit:");
        for (Provincia prov : pais.getProvinciasConMayoridadDeficit()) {
            System.out.println(prov.getNombre());
        }
    }
}
