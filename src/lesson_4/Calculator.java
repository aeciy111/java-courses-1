package lesson_4;
import java.math.BigDecimal;
public class Calculator {
    public static final String VALID_EXPRESSION_MESSAGE = "Enter expression. For example: \"2 + 3\", or \"+ 5\" to use memory";
    private String[] args;
    private String result;

    public void calculate(String ... args) throws Exception {
        this.args = args;
        checkArgsCount();
        executeOperation();
    }

    private void checkArgsCount() throws Exception {
        if ((this.args.length < 2) || (this.args.length > 3)) {
            throw new  Exception("Invalid expression! " + VALID_EXPRESSION_MESSAGE);
        } else if (this.args.length == 2){
            // use previous results for calculations;
            useMemory();
        }
    }

    private void useMemory() throws Exception{
        if (result == null) {
            throw new Exception("Error! Memory is empty!");
        } else {
            String[] newArgs = new String[args.length + 1];
            newArgs[0] = result;
            System.arraycopy(args, 0, newArgs, 1, args.length);
            this.args = newArgs;
        }
    }

    private void executeOperation() throws Exception {        
        BigDecimal first = new BigDecimal(args[0]);
        BigDecimal second = new BigDecimal(args[2]);
        switch (this.args[1]) {
            case "+" : add(first, second); break;
            case "-" : subtract(first, second); break;
            case "*" : multiply(first, second); break;
            case "/" : divide(first, second); break;
            case "^" : pow(first, second); break; 
            default : throw new  Exception("Wrong operator! " + VALID_EXPRESSION_MESSAGE);
        }
    }

    private void add(BigDecimal first, BigDecimal second) throws NumberFormatException {
        this.result = first.add(second).toString();
    }

    private void subtract(BigDecimal first, BigDecimal second) {
        this.result = first.subtract(second).toString();
    }

    private void multiply(BigDecimal first, BigDecimal second) {
        this.result = first.multiply(second).toString();
    }

    private void divide(BigDecimal first, BigDecimal second) throws Exception {
        if (first.equals(new BigDecimal(0))) {
            throw new Exception("Error! Division by zero!");
        }
        this.result = first.divide(second).toString();
    }

    private void pow(BigDecimal first, BigDecimal second) {
        result = new BigDecimal(Math.pow(first.doubleValue(), second.doubleValue())).toString();
    }

    public String getResult() {
        return this.result;
    }

    public boolean hasEmptyMemory() {
        return this.result == null;
    }
}