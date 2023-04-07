import java.util.Scanner;

public class TollBooth {
    private String vehicleType;
    private int numAxles;
    private double distanceTraveled;
    private double tollFee;
    private double totalAmountDue;
    
    public void showMenu() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Menu Options:");
            System.out.println("1. Enter vehicle type");
            System.out.println("2. Enter number of axles");
            System.out.println("3. Enter distance traveled");
            System.out.println("4. Calculate toll fee");
            System.out.println("5. Generate bill");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter vehicle type (car, van, bus, or truck): ");
                    vehicleType = scanner.next();
                    break;
                case 2:
                    System.out.print("Enter number of axles: ");
                    numAxles = scanner.nextInt();
                    break;
                case 3:
                    System.out.print("Enter distance traveled: ");
                    distanceTraveled = scanner.nextDouble();
                    break;
                case 4:
                    tollFee = calculateTollFee();
                    System.out.println("Toll fee: $" + tollFee);
                    break;
                case 5:
                    totalAmountDue = generateBill();
                    System.out.println("Total amount due: $" + totalAmountDue);
                    break;
                case 6:
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
    
    private double calculateTollFee() {
        double baseRate = 0.25;
        if (vehicleType.equals("truck")) {
            baseRate = 0.5;
        }
        return baseRate * numAxles * distanceTraveled;
    }
    
    private double generateBill() {
        double processingFee = 2.0;
        return tollFee + processingFee;
    }
    
    public static void main(String[] args) {
        TollBooth tollBooth = new TollBooth();
        tollBooth.showMenu();
    }
}
