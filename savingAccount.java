public class savingAccount extends account  {
    private double interestRate;

    public savingAccount(int accountNum, Customer customer, double balance, double interestRate) {
        super(accountNum, customer, balance); 
        this.interestRate = interestRate;
    }

    public double calculateInterest() {
        return getBalance() * interestRate;
    }

    public void applyInterest() {
        double interest = calculateInterest();
        deposit(interest); // Add the interest to the account balance
        System.out.println("Interest of " + interest + " applied to account " + getAccountNumber());
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    
    }
}
