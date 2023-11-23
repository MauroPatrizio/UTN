import java.util.Scanner;

public class Mutant {
    static Scanner scanner = new Scanner(System.in);

    //Validates the String to have 6 chars with the letter A,T,C,G
    public static String val_dna(int i) {
        while (true) {
            System.out.println("Enter the " + (i + 1) + " string of 6 DNA letters (Only A,T,C,G are valid, without spaces or characters between): ");
            String cadena = scanner.nextLine().toUpperCase().trim();
            if (cadena.matches("^[A,T,C,G]{6}$")) {
                return cadena;
            } else {
                System.out.println("Invalid input, try again");
            }
        }
    }

    //Fill the 6*6 matrix
    public static char[][] fillDna() {
        char[][] dna_matrix = new char[6][6];
        for (int row = 0; row < 6; row++) {
            String dna = val_dna(row);
            for (int col = 0; col < 6; col++) {
                dna_matrix[row][col] = dna.charAt(col);
            }
        }
        return dna_matrix;
    }

    //Show the 6*6 Matrix
    public static void showMatrix(char[][] dna) {
        for (int row = 0; row < 6; row++) {
            for (int col = 0; col < 6; col++) {
                System.out.print(dna[row][col] + "\t");
            }
            System.out.println();
        }
    }

    //Look for mutant dna and returns a boolean
    public static boolean isMutant(char[][] dna) {
        boolean mutant = false;
        int qty = 0;

        for (int row = 0; row < 6; row++) {
            for (int col = 0; col < 6; col++) {

                //Loop for horizontal line match
                if (col <= 2) {
                    mutant = true;
                    for (int i = 1; i < 4; i++) {
                        mutant = mutant && (dna[row][col] == dna[row][col + i]);
                        if (mutant== false){
                            break;
                        }
                    }
                    if (mutant) {
                        qty++;
                    }
                }



                //Loop for vertical line match
                if (row <= 2) {
                    mutant = true;
                    for (int i = 1; i < 4; i++) {
                        mutant = mutant && (dna[row][col] == dna[row + i][col]);
                        if (mutant== false){
                            break;
                        }
                    }
                    if (mutant) {
                        qty++;
                    }
                }




                //Loop for diagonal line match
                if (row <= 2 && col <= 2) {
                    mutant = true;
                    for (int i = 1; i < 4; i++) {
                        mutant = mutant && (dna[row][col] == dna[row + i][col + i]);
                        if (mutant== false){
                            break;
                        }
                    }
                    if (mutant) {
                        qty++;
                    }
                }



                //Loop for inverse diagonal
                if (row <= 2 && col >= 3) {
                    mutant = true;
                    for (int i = 1; i < 4; i++) {
                        mutant = mutant && (dna[row][col] == dna[row + i][col - i]);
                        if (mutant== false){
                            break;
                        }
                    }
                    if (mutant) {
                        qty++;
                    }
                }


                if (qty > 1) {
                    break;
                }
            }
        }
        return (qty > 1);
    }
}