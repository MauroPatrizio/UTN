import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> autos = new ArrayList<String>();
        String marca;
        do {
            System.out.println("Ingrese la marca de auto a agregar (0 to quit)");
            marca = scanner.nextLine().trim();
            if (!marca.equals("0")){
                autos.add(marca);
            }
        }while (!marca.equals("0"));
        System.out.println(autos.toString());
    }
}
