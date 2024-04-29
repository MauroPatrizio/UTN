package Ej5;

import java.util.Scanner;

public class MainListaTareas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ListaDeTareas listadetareas = new ListaDeTareas();
        boolean salir = false;

        while (!salir){
            System.out.println("Ingrese 1 para agregar una nueva tarea");
            System.out.println("Ingrese 2 para mostrar las tareas");
            System.out.println("Ingrese 3 para eliminar una tarea");
            System.out.println("Ingrese 4 para eliminar toda la lista");
            System.out.println("Ingrese 5 para salir");
            int opcion = scanner.nextInt();

            switch (opcion){
                case 1:
                    System.out.println("Ingrese la descripcion de la tarea: ");
                    String descripcion = scanner.nextLine();
                    System.out.println("Ingrese la prioridad de la tarea: ");
                    int prioridad = scanner.nextInt();
                    listadetareas.agregarNuevaTarea(new Tarea(descripcion, prioridad));
                    break;
                case 2:
                    System.out.println("Lista segun orden de prioridad: \n");
                    listadetareas.mostrarTareas();
                    break;
                case 3:
                    System.out.println("Ingrese la descripcion de la tarea que quiere eliminar");
                    descripcion = scanner.nextLine();
                    listadetareas.eliminarTareaEspecifica(descripcion);
                    System.out.println("Tarea eliminada");
                case 4:
                    System.out.println("Realmente quiere eliminar toda la lista? (Y/N)");
                    String confirmacion = scanner.nextLine().toUpperCase();
                    if(confirmacion.equals("Y")){
                        listadetareas.eliminarTareasExistentes();
                        break;
                    } else if (confirmacion == "N"){
                        break;
                    } else{
                        System.out.println("Input no válido");
                    }
                case 5:
                    System.out.println("Good bye!");
                    salir = true;
            }
        }
    }
}
