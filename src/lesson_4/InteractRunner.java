package lesson_4;

import java.util.Scanner;

public class InteractRunner {
    public static void main(String[] args) {
        try (Scanner reader = new Scanner(System.in)) {
            Calculator calculator = new Calculator();
            String exit = "no";
            while (!exit.equals("yes")) {
                String first;
                String memoryAnswer = "n";
                if (!calculator.hasEmptyMemory()) {
                    System.out.print("Use value from memory (" + calculator.getResult() + ")? [y/n]: ");
                    memoryAnswer = reader.next();
                }

                if (memoryAnswer.equals("y")) {
                    first = calculator.getResult();
                } else {
                    System.out.print("Enter first arg : ");
                    first = reader.next();
                }

                System.out.print("Enter second arg : ");
                String second = reader.next();
                System.out.print("Enter operator (+,-,*,/,^) : ");
                String operator = reader.next();
                try {
                    calculator.calculate(first, operator, second);
                    System.out.println("Result : " + calculator.getResult());
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
                System.out.print("Exit : yes/no : ");
                exit = reader.next();
            }
        }
    }
}