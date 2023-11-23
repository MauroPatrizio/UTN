import java.util.ArrayList;
import java.util.Scanner;

public class Autos {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> autos = new ArrayList<>();
        char opt;
        do {
            System.out.println("Ingrese la marca de auto: ");
            String auto = scanner.nextLine().trim();
            if (!autos.contains(auto)) {
                autos.add(auto);
            } else {
                System.out.println("La marca de auto ya estaba en la lista");
            }
            do {
                System.out.println("Quiere agregar otra marca de auto? (Y/N)");
                opt = scanner.nextLine().toUpperCase().charAt(0);
                if (opt == 'Y' || opt == 'N') {
                    break;
                } else {
                    System.out.println("Invalid input");
                }
            } while (true);

        } while (opt != 'N');
        System.out.println(autos);
    }
}
