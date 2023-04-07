import java.util.Scanner;

public class program {
    private double height; // height in meters
    private double weight; // weight in kilograms

    public program(double height, double weight) {
        this.height = height;
        this.weight = weight;
    }

    // getter and setter methods
    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double calculateBMI() {
        return weight / (height * height);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your height in meters: ");
        double height = scanner.nextDouble();
        System.out.print("Enter your weight in kilograms: ");
        double weight = scanner.nextDouble();

        program calculator = new program(height, weight);
        double bmi = calculator.calculateBMI();

        System.out.printf("Your BMI is %.2f%n", bmi);
    }
}
