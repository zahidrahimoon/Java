class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiplication(int a, int b) {
        return a * b;
    }

    public int division(int a, int b) {
        return a / b;
    }
}

public class Java18 {
    public static void main(String args[]) {
        Calculator cal = new Calculator();
        int sum = cal.add(5, 10);
        int subtraction = cal.subtract(10, 5);
        int multiplication = cal.multiplication(5, 10);
        int division = cal.division(10, 5);

        System.out.println("Addition " + sum);
        System.out.println("Subtraction " + subtraction);
        System.out.println("Multiplication " + multiplication);
        System.out.println("Division " + division);
    }
}
