import java.util.Scanner;

public class RationalNumberCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first rational number:");
        System.out.print("Numerator: ");
        int num1 = sc.nextInt();
        System.out.print("Denominator: ");
        int den1 = sc.nextInt();

        System.out.println("Enter the second rational number:");
        System.out.print("Numerator: ");
        int num2 = sc.nextInt();
        System.out.print("Denominator: ");
        
        int den2 = sc.nextInt();

        System.out.print("Enter the arithmetic operation (+, -, *, /): ");
        String operator = sc.next();

        int resultNum = 0, resultDen = 0;

        switch(operator) {
            case "+":
                resultNum = num1 * den2 + num2 * den1;
                resultDen = den1 * den2;
                break;
            case "-":
                resultNum = num1 * den2 - num2 * den1;
                resultDen = den1 * den2;
                break;
            case "*":
                resultNum = num1 * num2;
                resultDen = den1 * den2;
                break;
            case "/":
                resultNum = num1 * den2;
                resultDen = den1 * num2;
                break;
            default:
                System.out.println("Invalid operator");
                
        }

        // Reduce the result fraction
        int gcd = getGCD(resultNum, resultDen);
        resultNum /= gcd;
        resultDen /= gcd;

        System.out.println("Result: " + resultNum + "/" + resultDen);
    }

    // Function to calculate the GCD of two integers using Euclid's algorithm
    public static int getGCD(int a, int b) {
        if (b == 0)
            return a;
        return getGCD(b, a % b);
    }
}
