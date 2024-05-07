package Ej1;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int numRandom = random.nextInt(100)+1;
        int attempts = 0;
        boolean guessed = false;

        Scanner scanner = new Scanner(System.in);

        while (!guessed){
            try {
                System.out.println("Enter your guess (number between 1 and 100): ");
                int guess = scanner.nextInt();
                attempts++;

                if(guess< 1 || guess>100){
                    System.out.println("Your guess is not valid, please enter an entire number between 1 and 100");
                } else if (guess == numRandom) {
                    guessed = true;
                    System.out.println("Congrats! You guessed the number!, You guessed it in " + attempts + " attempts!");
                } else if (guess < numRandom) {
                    System.out.println("The number is higher");
                } else if (guess > numRandom) {
                    System.out.println("The number is lower");
                }
            } catch (InputMismatchException e){
                System.out.println("Exception: Your guess is not valid, please enter an entire number between 1 and 100");
                scanner.next();
            }
        }
    }
}


