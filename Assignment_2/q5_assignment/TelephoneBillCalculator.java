import java.util.Scanner;

public class TelephoneBillCalculator {

    public static void main(String[] args) {
        // Input customer details
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter customer name: ");
        String customerName = scanner.nextLine();
        System.out.print("Enter phone number: ");
        String phoneNumber = scanner.nextLine();
        System.out.print("Enter number of calls made: ");
        int numberOfCalls = scanner.nextInt();
        System.out.print("Enter total duration of calls (in minutes): ");
        int totalDuration = scanner.nextInt();
        scanner.close();

        // Calculate bill amount
        double flatRate = 10.0;
        int freeCalls = 100;
        double callRate = 0.25;
        double callCharge = 0.5;
        int minimumDuration = 1;
        int durationPerCall = (totalDuration + numberOfCalls - 1) / numberOfCalls; // Round up to the nearest minute
        int chargeableCalls = Math.max(numberOfCalls - freeCalls, 0);
        double callAmount = chargeableCalls * callRate + Math.min(numberOfCalls, freeCalls) * callCharge;
        double billAmount = flatRate + callAmount;

        // Display bill
        System.out.println("Customer Name: " + customerName);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("Number of Calls Made: " + numberOfCalls);
        System.out.println("Total Duration of Calls (in minutes): " + totalDuration);
        System.out.println("Bill Amount: $" + billAmount);
    }
}
