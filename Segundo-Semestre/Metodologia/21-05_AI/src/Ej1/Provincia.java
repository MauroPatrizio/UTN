package Ej1;

import java.util.ArrayList;
import java.util.List;

public class Provincia {
    private String nombre;
    private String capital;
    private Pais pais;
    private List<Ciudad> ciudades;

    public Provincia(String nombre, String capital, Pais pais) {
        this.nombre = nombre;
        this.capital = capital;
        this.pais = pais;
        this.ciudades = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public String getCapital() {
        return capital;
    }

    public Pais getPais() {
        return pais;
    }

    public List<Ciudad> getCiudades() {
        return ciudades;
    }

    public void agregarCiudad(Ciudad ciudad) {
        ciudades.add(ciudad);
    }

    public boolean tieneMayoridadDeficit() {
        int countDeficit = 0;
        for (Ciudad ciudad : ciudades) {
            if (ciudad.tieneDeficit()) {
                countDeficit++;
            }
        }
        return countDeficit > ciudades.size() / 2;
    }
}
