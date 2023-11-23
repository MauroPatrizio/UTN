import java.net.PasswordAuthentication;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        String bucle;
        do {
            System.out.println("Elija un número de ejercicio (1-16): ");
            String opt = scanner.nextLine();
            switch (opt) {
                case "1" -> {
                             System.out.println("Ingrese su número de teléfono (debe contener entre 7 y 10 digitos): ");
                             String tel = scanner.nextLine();
                             System.out.println(valTel(tel));
                            }
                case "2" -> {
                              System.out.println ("Ingrese su cuil (formato XX-XXXXXXXXX-X): ");
                              String cuil = scanner.nextLine();
                              System.out.println(valCuil(cuil));
                             }
                case "3" -> {
                             System.out.println("Ingrese su email: ");
                             String email = scanner.nextLine();
                             System.out.println(valEmail(email));
                            }
                case "4" -> System.out.println(valNomenclatura());
                case "5" -> System.out.println(valLetras());
                case "6" -> System.out.println(valCombinacion());
                case "7" -> System.out.println(valEmailMultiple());
                case "8" -> {
                             System.out.println("Ingrese un teléfono internacional");
                             String tel = scanner.nextLine();
                             System.out.println(valTelInternacional(tel));
                            }
                case "9" -> {
                             System.out.println("Ingrese su email con dominio miempresa.com: ");
                             String email = scanner.nextLine();
                             System.out.println(valEmailEmpresa(email));
                            }
                case "10" -> {
                              System.out.println("Ingrese su código postal (4 números): ");
                              String cp = scanner.nextLine();
                              System.out.println(valCP(cp));
                             }
                case "11" -> {
                              System.out.println("Ingrese su código dni (8 números): ");
                              String cp = scanner.nextLine();
                              System.out.println(valCP(cp));
                             }
                case "12" -> {
                              System.out.println("Ingrese su usuario (Letras, números y guiones bajos, entre 3 y 15 caracteres): ");
                              String usuario = scanner.nextLine();
                              System.out.println(valUsuario(usuario));
                             }
                case "13" -> {
                              System.out.println("Ingrese una fecha (formato dd/mm/aaaa): ");
                              String fecha = scanner.nextLine();
                              System.out.println(valFecha(fecha));
                             }
                case "14" -> {
                              System.out.println("Ingrese su dominio web: ");
                              String web = scanner.nextLine();
                              System.out.println(valWeb(web));
                              }
                case "15" -> {
                              System.out.println("Ingrese el nombre de su producto (entre 5 y 15 caracteres): ");
                              String nombre = scanner.nextLine();
                              System.out.println(valNombreProducto(nombre));
                        }
                case "16" -> {
                              System.out.println("Ingrese contraseña (Entre 8 y 16 caracteres, debe contener al menos un caracter especial, una mayúscula, una minúscula y un número): ");
                              String password = scanner.nextLine();
                              System.out.println(valPassword(password));
                             }
                default -> System.out.println("Número de ejercicio inválido");
            }

            do{
                System.out.println("Quiere elegir otor ejercicio? (Y/N): ");
                bucle = scanner.nextLine().toUpperCase().trim();
            }while(!bucle.equals("Y") && !bucle.equals("N"));

        } while (!bucle.equals("N"));
        System.out.println("Saliendo del programa");

    }
    //1
    public static boolean valTel(String tel){
        return tel.matches("^\\d{7,10}$");
    }

    //2
    public static boolean valCuil(String cuil){
            return cuil.matches("^\\d{2}-\\d{8}-\\d$");
    }

    //3
    public static boolean valEmail(String email){
        return email.matches("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@" + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
    }

    //4
    public static boolean valNomenclatura(){
        System.out.println("Escriba una nomenclatura de 22 caracteres: ");
        String nomenclatura = scanner.nextLine();
        return nomenclatura.matches("^\\w{22}");
    }

    //5
    public static boolean valLetras(){
            System.out.println("Ingrese su nombre (entre 7 y 10 letras): ");
            String nombre = scanner.nextLine();
            return nombre.matches("^[a-zA-Z]{7,10}");
    }

    //6
    public static HashMap<String, Boolean> valCombinacion(){
        HashMap<String, Boolean> dicc = new HashMap<>();
        System.out.println("Ingrese su número de teléfono (debe contener entre 7 y 10 digitos): ");
        String tel = scanner.nextLine();
        dicc.put("tel", valTel(tel));
        System.out.println ("Ingrese su cuil (formato XX-XXXXXXXXX-X): ");
        String cuil = scanner.nextLine();
        dicc.put("cuil",valCuil(cuil));
        System.out.println("Ingrese su email: ");
        String email = scanner.nextLine();
        dicc.put("email",valEmail(email));
        return dicc;
    }

    //7
    public static boolean valEmailMultiple(){
        System.out.println("Ingrese una lista de correos separados por coma: ");
        String correos = scanner.nextLine().toLowerCase().trim();
        String[] listaCorreos = correos.split(",");
        for (String correo: listaCorreos) {
            if(!valEmail(correo.trim())){
                return false;
            }
        }
        return true;
    }

    //8
    public static boolean valTelInternacional(String tel){
        return tel.matches("^\\+\\d{1,4}-\\\\d{1,15}$");
    }

    //9
    public static boolean valEmailEmpresa(String email){
        return email.matches("^[_A-Za-z0-9-+]+(\\.[_A-Za-z0-9-]+)*@" + "miempresa.com$");
    }

    //10
    public static boolean valCP(String cp){
        return cp.matches("^\\d{4}$");
    }

    //11
    public static boolean valDNI(String dni){
        return dni.matches("^\\d{8}");
    }

    //12
    public static boolean valUsuario(String usuario){
        return usuario.matches("^\\w{3,15}$");
    }

    //13
    public static boolean valFecha(String fecha){
        return fecha.matches("^\\d{2}/\\d{2}/\\d{4}$");
    }

    //14
    public static boolean valWeb(String web){
        return web.matches("^(https?://)?(www.)?\\w{1,30}\\.[a-zA-Z]{2,3}(\\.[a-zA-Z]{2})?$");
    }

    //15
    public static boolean valNombreProducto(String nombre){
        return nombre.matches("^[a-zA-Z]{5,15}");
    }

    //16
    public static boolean valPassword(String password){
        return password.matches("^((?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&-+=()/])(?=\\S+$)).{8,20}$");
    }
}
