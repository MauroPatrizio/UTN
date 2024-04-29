package Ej4;

import java.util.ArrayList;
import java.util.Iterator;

public class AdministracionDeAlumnos implements Iterable<Alumno> {

    private ArrayList<Alumno> listaAlumnos = new ArrayList<>();
    @Override
    public Iterator<Alumno> iterator() {
        return listaAlumnos.iterator();
    }

    public void agregarAlumno(Alumno alumno){
        listaAlumnos.add(alumno);
    }

    public ArrayList<Alumno> getListaAlumnos(){
        return listaAlumnos;
    }

    public double mediaNotas(){
        double sumNotas = 0;
        for (Alumno nota : listaAlumnos){
            sumNotas += nota.getNota();
        }
        return sumNotas/listaAlumnos.size();
    }


}
