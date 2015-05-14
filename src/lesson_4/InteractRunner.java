package lesson_4;

import java.util.Scanner;

public class InteractRunner {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        String inputString;
        Calculator calculator = new Calculator();
        do {
            System.out.print(Calculator.VALID_EXPRESSION_MESSAGE + ": ");
            inputString = inputScanner.nextLine();
            try {
                String[] inputArgs = inputString.split(" ");
                calculator.calculate(inputArgs);
                System.out.println("Result: " + calculator.getResult());
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

        } while (!inputString.equals("q"));
    }
}