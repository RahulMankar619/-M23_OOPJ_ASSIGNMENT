public class CreditScoreCalculator {
    private int creditHistory;
    private double creditUtilization;
    private boolean paymentHistory;

    public CreditScoreCalculator() {
        this.creditHistory = creditHistory;
        this.creditUtilization = creditUtilization;
        this.paymentHistory = paymentHistory;
    }

    public int getCreditHistory() {
        return creditHistory;
    }

    public void setCreditHistory(int creditHistory) {
        this.creditHistory = creditHistory;
    }

    public double getCreditUtilization() {
        return creditUtilization;
    }

    public void setCreditUtilization(double creditUtilization) {
        this.creditUtilization = creditUtilization;
    }

    public boolean getPaymentHistory() {
        return paymentHistory;
    }

    public void setPaymentHistory(boolean paymentHistory) {
        this.paymentHistory = paymentHistory;
    }

    public int calculateCreditScore() {
        int creditScore;
        if (paymentHistory) {
            creditScore = (creditHistory * 15) + (int) (creditUtilization * 30) + 55;
        } else {
            creditScore = (creditHistory * 15) + (int) (creditUtilization * 30) + 35;
        }
        return creditScore;
    }
    public static void main(String[] args) {
    CreditScoreCalculator calculator = new CreditScoreCalculator();
    
    // set values for the fields
    calculator.setCreditHistory(5);
    calculator.setCreditUtilization(0.3);
    calculator.setPaymentHistory(true);
    
    // calculate the credit score
    int creditScore = calculator.calculateCreditScore();
    System.out.println("Credit score: " + creditScore);
}

}
