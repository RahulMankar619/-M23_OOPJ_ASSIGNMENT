public class ElectricityBill {
    private String customerName;
    private double unitsConsumed;
    private double billAmount;

    public ElectricityBill(String customerName, double unitsConsumed) {
        this.customerName = customerName;
        this.unitsConsumed = unitsConsumed;
    }

    public void calculateBillAmount() {
        if (unitsConsumed <= 100) {
            billAmount = unitsConsumed * 5;
        } else if (unitsConsumed > 100 && unitsConsumed <= 300) {
            billAmount = 100 * 5 + (unitsConsumed - 100) * 7;
        } else {
            billAmount = 100 * 5 + 200 * 7 + (unitsConsumed - 300) * 10;
        }
    }

    public String getCustomerName() {
        return customerName;
    }

    public double getUnitsConsumed() {
        return unitsConsumed;
    }

    public double getBillAmount() {
        return billAmount;
    }

    public static void main(String[] args) {
        ElectricityBill bill = new ElectricityBill("Rahul Mankar", 250.5);
        bill.calculateBillAmount();
        System.out.println("Customer Name: " + bill.getCustomerName());
        System.out.println("Units Consumed: " + bill.getUnitsConsumed());
        System.out.println("Bill Amount: Rs. " + bill.getBillAmount());
    }
}
