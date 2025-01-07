import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number:");
        double num1 = sc.nextDouble();
        System.out.println("Enter second number:");
        double num2 = sc.nextDouble();
        System.out.println("Select an operation (+, -, *, /):");
        char operator = sc.next().charAt(0);
        double result = 0;
        boolean valid = true;

        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
	    case '-':
                result = num1 - num2;
                break;
	    case '*':
		result = num1 * num2;
		break;
	    default:
                valid = false;
	    case '/':
                if (num2 != 0) result = num1 / num2;
                else valid = false;
                break;
        }

        if (valid) System.out.println("Result: " + result);
        else System.out.println("Invalid operation or division by zero.");
    }
}
