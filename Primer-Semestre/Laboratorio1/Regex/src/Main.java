import java.util.ArrayList;
// 1
/*Las expresiones regulares son patrones utilizados para buscar, validar y manipular texto en cadenas de caracteres.
En java se utilizan a través de java.util.regex.Pattern  java.util.regex.Matcher.
Caracteres Especiales: Las expresiones regulares utilizan caracteres especiales para representar patrones más flexibles. Algunos de los caracteres especiales más comunes son:
•	. Coincide con cualquier carácter excepto el salto de línea.
•	* Coincide con cero o más repeticiones del elemento anterior.
•	+ Coincide con una o más repeticiones del elemento anterior.
•	? Coincide con cero o una repetición del elemento anterior.
•	[] Define un conjunto de caracteres. Por ejemplo, [aeiou] coincide con cualquier vocal.
•	| Se utiliza para alternancia. Por ejemplo, a|b coincide con "a" o "b"
Cuantificadores: Los cuantificadores se utilizan para especificar el número de repeticiones de un elemento en una expresión regular.
•	{n}: Coincide exactamente con "n" repeticiones del elemento anterior.
•	{n,}: Coincide con al menos "n" repeticiones del elemento anterior.
•	{n,m}: Coincide con al menos "n" y como máximo "m" repeticiones del elemento anterior.
Grupos: Los grupos se utilizan para agrupar elementos en una expresión regular y aplicar cuantificadores u operadores a todo el grupo en lugar de un solo carácter. Se definen utilizando paréntesis. Por ejemplo, (ab)+ coincide con una o más repeticiones de "ab". */


public class Main {
    public static void main(String[] args) {
    // •Comprobar si el String cadena no acaba con un dígito.
    String cadena = "asdfas123a";
    System.out.println(!cadena.matches(".*\\d$") ? "La cadena " + cadena + " no termina con un dígito" : "La cadena " + cadena + "termina con un dígito");

	//Comprobar si el String cadena no empieza por un dígito.
    String cadena1 = "123aasdfsadf";
    System.out.println(!cadena1.matches("^\\d.*") ? "La cadena "+ cadena1+  " no empieza con un dígito" : "La cadena " + cadena1 + " empieza con un dígito");

    //Comprobar si el String cadena está formado por un mínimo de 5 letras mayúsculas o minúsculas y un máximo de 10.
    String cadena2 = "asdfASDf";
    System.out.println(cadena2.matches("^[a-zA-Z]{5,10}$") ? "La cadena " + cadena2 + " cumple los requisitos" : "La cadena " + cadena2 + " no cumple los requisitos");

    //Validar el ingreso de un DNI (xx-xxx-xxx).
    String dni = "12-345-678";
    System.out.println(dni.matches("^\\d{2}-\\d{3}-\\d{3}$") ? "El dni " + dni + " cumple las condiciones" : "El dni " + dni + " no cumple las condiciones");

    //Guardar en un arraylist una serie de mails, pero antes de ser guardados deben cumplir con las condiciones de las expresiones regulares.
    ArrayList<String> listaCorreos = new ArrayList<>();
    listaCorreos.add("correo1@gmail.com") ;
    listaCorreos.add("correo2@gmail.com");
    listaCorreos.add("correo3");
    listaCorreos.add("correo4@hotmail.com");

    ArrayList<String> correosValidos = new ArrayList<>();

    for (String correo : listaCorreos) {
        if (correo.matches("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$")) {
            correosValidos.add(correo);
        }
    }

    System.out.println("Correos válidos: " + correosValidos);

    //Comprobar si el String cadena contiene “abc”.
    String cadena4 = "La cadena contiene abc en alguna parte.";
    System.out.println(cadena4.matches(".*abc.*") ? "La cadena contiene 'abc'" : "La cadena no contiene 'abc'");
    }
}
