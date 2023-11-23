import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String opt;
        do {
            char[][] dna_matrix = Mutant.fillDna();
            Mutant.showMatrix(dna_matrix);
            System.out.println(Mutant.isMutant(dna_matrix) ? "You are a mutant!" : "You are NOT a mutant");
            do{
                System.out.println("Enter 'Y' to check another dna, enter 'N' to exit: ");
                opt = scanner.nextLine().toUpperCase().trim();
                if (opt.equals("N") || opt.equals("Y")){
                    break;
                } else {
                    System.out.println("Invalid input");
                }
            } while (!opt.equals("N"));

        }while (!opt.equals("N"));
        System.out.println("Good Bye!");
    }
}

//["ATGCGA","CAGTGC","TTATGT","AGAAGG","CCCCTA","TCACTG"] Mutant dna
//["aaaact", "agtgcg", "acgtta", "actcca", "ctaatc", "gcagct"] Mutant dna (1 vertical match and 1 horizontal match, both starting in index 0,0)
//["ATGCGA","CAGTGC","TTATTT","AGACGG","GCGTCA","TCACTG"] Not mutant dna
//["atgcaa", "ccgtgc", "ttatgt", "agaagg", "ccccta", "tcactg"] Not mutant dna (1 horizontal match)
//["ttgcga", "cagtgc", "ttatgt", "agaagg", "acccta", "tcactg"] Not mutant dna (1 vertical match)
//["atgcta", "cagtgc", "ttatgt", "agaagg", "acccta", "tcactg"] Not mutant dna (1 diagonal match)
//["ttgcga", "caggtc", "ttgtat", "agaatg", "cccgta", "tcactg"] Not mutant dna (1 reverse diagonal match)
