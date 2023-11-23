import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

/*	Crea un conjunto de datos ficticio que contenga información variada, como direcciones de correo electrónico,
números de teléfono, fechas, códigos postales, etc.*/
//3.	Validación de Datos:
 /* Diseña un programa en un lenguaje de programación (Java) que utilice expresiones regulares para validar y verificar los datos en tu conjunto de datos.
 Por ejemplo, puedes verificar si una dirección de correo electrónico es válida o si un número de teléfono sigue un formato específico.

•	Validar entrada de datos en un arraylist y aplicarlo.*/
public class Ej2_3 {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) throws ParseException {
        ArrayList<Persona> datosFicticios = new ArrayList<>();
        String opt;
        do {
            String email = inputEmail("Ingrese su email:");
            String tel = inputTel("Ingrese su número de teléfono (formato XXX-XXX-XXXX): ");
            Date birthday = inputDate("Ingrese su fecha de nacimiento (formato DD/MM/AAAA): ");
            String cp = inputPostalCode("Ingrese su código postal: ");
            datosFicticios.add(new Persona(email, tel, cp,birthday));
            do {
                System.out.println("Quiere añadir otra persona? (Y/N)");
                opt = scanner.nextLine().toUpperCase().trim();
                if (opt.equals("Y") || opt.equals("N")){
                    break;
                } else {
                    System.out.println("Invalid input");
                }
            } while (true);

        } while (!opt.equals("N"));

        System.out.println(datosFicticios.toString());

        System.out.println("Cerrando programa");
    }

    public static String inputEmail(String text) {
        do {
            System.out.println(text);
            String email = scanner.nextLine();
            if (email.matches("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$")) {
                return email;
            } else {
                System.out.println("Invalid input");
            }
        } while (true);
    }

    public static String inputTel(String text) {
        do {
            System.out.println(text);
            String tel = scanner.nextLine();
            if (tel.matches("^\\d{3}-\\d{3}-\\d{4}$")){
                return tel;
            } else {
                System.out.println("Invalid input");
            }
        } while (true);
    }

    public static Date inputDate(String text){
        do {
            System.out.println(text);
            String birthday = scanner.nextLine();
            if (birthday.matches("^\\d{2}\\/\\d{2}\\/\\d{4}$")){
                SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
                try {
                    return  dateFormat.parse(birthday);
                } catch (ParseException e){
                    System.err.println("Error al convertir la cadena a Date");
                }

            } else {
                System.out.println("Invalid input");
            }
        } while (true);
    }

    public static String inputPostalCode(String text) {
        do {
            System.out.println(text);
            String cp = scanner.nextLine();
            if (cp.matches("^\\d{4}$")){
                return cp;
            } else {
                System.out.println("Invalid input");
            }
        } while (true);
    }
}


