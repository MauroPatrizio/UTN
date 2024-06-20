package Ej1;

import java.util.ArrayList;
import java.util.List;

public class Pais {
    private String nombre;
    private String capital;
    private String continente;
    private List<Provincia> provincias;

    public Pais(String nombre, String capital, String continente) {
        this.nombre = nombre;
        this.capital = capital;
        this.continente = continente;
        this.provincias = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public String getCapital() {
        return capital;
    }

    public String getContinente() {
        return continente;
    }

    public List<Provincia> getProvincias() {
        return provincias;
    }

    public void agregarProvincia(Provincia provincia) {
        provincias.add(provincia);
    }

    public List<Ciudad> getCiudadesConDeficit() {
        List<Ciudad> ciudadesConDeficit = new ArrayList<>();
        for (Provincia provincia : provincias) {
            for (Ciudad ciudad : provincia.getCiudades()) {
                if (ciudad.tieneDeficit()) {
                    ciudadesConDeficit.add(ciudad);
                }
            }
        }
        return ciudadesConDeficit;
    }

    public List<Provincia> getProvinciasConMayoridadDeficit() {
        List<Provincia> provinciasConMayoridadDeficit = new ArrayList<>();
        for (Provincia provincia : provincias) {
            if (provincia.tieneMayoridadDeficit()) {
                provinciasConMayoridadDeficit.add(provincia);
            }
        }
        return provinciasConMayoridadDeficit;
    }
}
