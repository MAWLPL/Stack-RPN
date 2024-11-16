package paczka;

public class RPN {
    private Stack stack;

    public RPN() {
        stack = new Stack();
    }

    public int evaluate(String function) {
        String[] symbols = function.split(" ");

        for (String symbol : symbols) {
            if (isOperator(symbol)) {
                int b = Integer.parseInt(stack.pop());
                int a = Integer.parseInt(stack.pop());

                int result = calculate(a, b, symbol);
                stack.push(String.valueOf(result));
            } else {
                stack.push(symbol);
            }
        }

        return Integer.parseInt(stack.pop());
    }

    private boolean isOperator(String symbol) {
        return "+-*/".contains(symbol);
    }

    private int calculate(int a, int b, String operator) {
        return switch (operator) {
            case "+" -> a + b;
            case "-" -> a - b;
            case "*" -> a * b;
            case "/" -> a / b;
            default -> throw new IllegalArgumentException("Błąd" + operator);
        };
    }
}
