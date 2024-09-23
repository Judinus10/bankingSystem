public class checkingAccount extends account {
    private double overdraftLimit;

    public checkingAccount(int accountNumber, Customer customer, double initialBalance, double overdraftLimit) {
        super(accountNumber, customer, initialBalance); // Call the constructor of the Account class
        this.overdraftLimit = overdraftLimit;
    }

    public double getOverdraftLimit() {
        return overdraftLimit;
    }

    public void setOverdraftLimit(double overdraftLimit) {
        this.overdraftLimit = overdraftLimit;
    }
}
