public class Problem1 {
    static class Calculator {
        double a, b;

        Calculator(double a, double b) {
            this.a = a;
            this.b = b;
        }

        double operate(String op) {
            switch (op.toLowerCase()) {
                case "add":
                    return a + b;
                case "sub":
                    return a - b;
                case "mul":
                    return a * b;
                case "div":
                    if (b == 0) {
                        System.out.println("Cannot divide by zero.");
                        return 0;
                    }
                    return a / b;
                default:
                    System.out.println("Invalid operation.");
                    return 0;
            }
        }
    }

    public static void main(String[] args) {
        double a = 10.5;
        double b = 5.0;
        String operation = "mul";  // Options: add, sub, mul, div

        Calculator calc = new Calculator(a, b);
        double result = calc.operate(operation);

        System.out.println("Result: " + result);
    }
}
