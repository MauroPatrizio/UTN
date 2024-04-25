import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String operator;
        float result = 0;

        try {
            System.out.println("Enter the first number");
            float number1 = scanner.nextFloat();
            System.out.println("Enter the second");
            float number2 = scanner.nextFloat();
            do {
                System.out.println("Enter the operator (+ - * / )");
                operator = scanner.next();
            } while (!operator.matches("[+\\-*/]"));

            switch (operator){
                case "+": result = number1 + number2;
                case "-": result = number1 - number2;
                case "*": result = number1 * number2;
                case "/":
                    if (number2 != 0){
                    result = number1 / number2;
                    } else {
                        throw new ArithmeticException("you cannot divide by 0");
                    }
                    break;
            }
            System.out.println("The result is: " + result);
        } catch (InputMismatchException e){
            System.out.println("Not a valid number");
        } catch (ArithmeticException e){
            System.out.println("You cannot divide by 0");
        }
    }
}

