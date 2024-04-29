package Ej5;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class ListaDeTareas implements Iterable<Tarea>{

    private List<Tarea> tareas;

    public ListaDeTareas() {
        this.tareas = new ArrayList<>();
    }

    public void agregarNuevaTarea(Tarea tarea){
        tareas.add(tarea);
        tareas.sort(Comparator.comparingInt(Tarea::getPrioridad).reversed());
    }

    public void eliminarTareasExistentes(){
        tareas.clear();
    }

    public void eliminarTareaEspecifica(String descripcion){
        tareas.removeIf(tarea -> tarea.getDescripcion().equals(descripcion));
    }

    public void mostrarTareas(){
        tareas.sort(Comparator.comparingInt(Tarea::getPrioridad).reversed());
        for(Tarea terea : tareas){
            System.out.println(tareas.toString());
        }
    }



    @Override
    public Iterator iterator() {
        return null;
    }
}
