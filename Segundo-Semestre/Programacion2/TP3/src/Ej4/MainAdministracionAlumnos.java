package Ej4;

import java.util.Scanner;

public class MainAdministracionAlumnos {
    public static void main(String[] args) {
        AdministracionDeAlumnos administracion = new AdministracionDeAlumnos();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n1. Agregar alumno");
            System.out.println("2. Mostrar lista de alumnos");
            System.out.println("3. Calcular y mostrar la media de notas");
            System.out.println("4. Mostrar alumno con la nota más alta");
            System.out.println("5. Buscar alumno por nombre");
            System.out.println("6. Salir");
            System.out.print("Ingrese su opción: ");
            int opcion = scanner.nextInt();
            scanner.nextLine(); // Consume el salto de línea después del número

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el nombre del alumno: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Ingrese la edad del alumno: ");
                    int edad = scanner.nextInt();
                    System.out.print("Ingrese la nota del alumno: ");
                    double nota = scanner.nextDouble();

                    Alumno alumno = new Alumno(nombre, edad, nota);
                    administracion.agregarAlumno(alumno);
                    System.out.println("Alumno agregado");
                    break;
                case 2:
                    System.out.println("Lista de alumnos:");
                    for (Alumno a : administracion) {
                        System.out.println(a);
                    }
                    break;
                case 3:
                    double media = administracion.mediaNotas();
                    System.out.println("La media de las notas es: " + media);
                    break;
                case 4:
                    Alumno alumnoMaxNota = administracion.getListaAlumnos().get(0);
                    for (Alumno a : administracion) {
                        if (a.getNota() > alumnoMaxNota.getNota()) {
                            alumnoMaxNota = a;
                        }
                    }
                    System.out.println("Alumno con la nota más alta: " + alumnoMaxNota);
                    break;
                case 5:
                    System.out.print("Ingrese el nombre del alumno a buscar: ");
                    String nombreBuscar = scanner.nextLine();
                    boolean encontrado = false;
                    for (Alumno a : administracion) {
                        if (a.getNombre().equalsIgnoreCase(nombreBuscar)) {
                            System.out.println("Información del alumno:");
                            System.out.println(a);
                            encontrado = true;
                            break;
                        }
                    }
                    if (!encontrado) {
                        System.out.println("Alumno no encontrado.");
                    }
                    break;
                case 6:
                    System.out.println("¡Hasta luego!");
                    System.exit(0);
                default:
                    System.out.println("Opción no válida. Por favor, seleccione una opción válida.");
            }
        }
    }
}
