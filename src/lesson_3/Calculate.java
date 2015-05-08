package lesson_3;

public class Calculate {
    public static void main(String[] args) throws Exception {
	if (args.length == 0) {
            test();
        } else {
            System.out.println("Calculate...");	
	
            double result = calculate(args);       
        
            System.out.println("Result : " + result);
        }
    }

    private static double calculate(String[] args) throws Exception {
	double first = Double.valueOf(args[0]);
        double second = Double.valueOf(args[2]);
        double result = 0.0;        
	switch (args[1]) {
            case "+" :
                result = first + second;
                break;
            case "-" :
                result = first - second;
                break;
            case "/" :
                result = first / second;
                break;
            case "*" :
                result = first * second;
                break;
            case "^" :
                result = first;
                for (int i = 0; i < second - 1; i++) {
                    result *= first;
                }
                break;
            default:
                throw new Exception("Wrong operator");
        }
	return result;
    }

    private static void test() throws Exception {
        String[][] testCases = {{"3", "+", "10", "13"},
                                {"5", "-", "7", "-2"},
                                {"3", "/", "2", "1.5"},
                                {"4", "*", "5", "20"},
                                {"5", "^", "2", "25"},
                               };
	
        for (int i = 0; i < testCases.length; i++) {
            double result = calculate(new String[]{testCases[i][0], testCases[i][1], testCases[i][2]});
            double expectedResult = Double.valueOf(testCases[i][3]);
            String testCaseOutput = "TestCase #" + (i + 1) + " result: " + 
                                    (Double.compare(result, expectedResult) == 0 ? "OK": "Error");
            System.out.println(testCaseOutput);
        } 
    }
}
