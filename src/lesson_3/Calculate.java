package lesson_3;

public class Calculate {
    public static void main(String[] args) {
        System.out.println("Calculate...");
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
                System.out.println("Wrong operator!");
                return;
        }
        System.out.println("Result : " + result);
    }
}
