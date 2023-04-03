package calculate_program_1;

public class Calculator {

    public void addition(int a, int b) {// Instance method with two parameters
        System.out.println("Addition of " + a + " and " + b + " is: " + (a + b));
    }

    public void subtraction(int a, int b) {// Instance method with two parameters
        System.out.println("Subtraction of " + a + " and " + b + " is: " + (a - b));
    }

    public void division(int a, int b) {// Instance method with two parameters
        if (b != 0) {// checking entered number is zero or not
            System.out.println("Division of " + a + " and " + b + " is: " + (a / b));
        } else {
            System.out.println(" Can not divide by zero!");
        }
    }

    public void multiplication(int a, int b) {// Instance method with two parameters
        System.out.println("Multiplication of " + a + " and " + b + " is: " + (a * b));
    }

    public void calculateResult(int a, int b, char symbol) {// Instance method with three parameters
        switch (symbol) {
            case '+':
                addition(a, b);
                break;
            case '-':
                subtraction(a, b);
                break;
            case '/':
                division(a, b);
                break;
            case '*':
                multiplication(a, b);
                break;
            default:
                System.out.println("Invalid symbol");
        }
    }
}
