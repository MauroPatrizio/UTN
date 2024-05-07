package Ej3;

import java.util.Scanner;

public class Ej3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Enter the base of the triangle: ");
            double base = scanner.nextDouble();

            System.out.println("Enter the height of the triangle: ");
            double height = scanner.nextDouble();

            Triangle triangle1 = new Triangle(base, height);

            triangle1.area();
        } catch (NumberFormatException e){
            System.out.println("Your input is invalid, enter a number");
        }
    }
}
