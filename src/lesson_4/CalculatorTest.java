package lesson_4;

import java.math.BigDecimal;

public class CalculatorTest {
    public static void main(String[] args) {
         String[][] testCases = {{"3", "+", "10", "13"},
                                {"5", "-", "7", "-2"},
                                {"3", "/", "2", "1.5"},
                                {"4", "*", "5", "20"},
                                {"5", "^", "2", "25"},
                               };

        for (int i = 0; i < testCases.length; i++) {
            String result = "";
            String expectedResult = testCases[i][3];
            try {
                String[] inputArgs = new String[3];
                System.arraycopy(testCases[i], 0, inputArgs, 0, inputArgs.length);
                Calculator calculator = new Calculator();
                calculator.calculate(inputArgs);
                result = calculator.getResult();
            } catch (Exception e) {
                e.printStackTrace();
            }
            String testCaseOutput = "TestCase #" + (i + 1) + " result: " +
                                    (new BigDecimal(result).equals(new BigDecimal(expectedResult)) ? "OK": "Error");
            System.out.println(testCaseOutput);
        }
    }
}
