public class CheckingAccount extends account {
    private double overdraftLimit;

    public CheckingAccount(int accountNumber, Customer customer, double initialBalance, double overdraftLimit) {
        super(accountNumber, customer, initialBalance); // Call the constructor of the Account class
        this.overdraftLimit = overdraftLimit;
    }

    public double getOverdraftLimit() {
        return overdraftLimit;
    }

    public void setOverdraftLimit(double overdraftLimit) {
        this.overdraftLimit = overdraftLimit;
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= (getBalance() + overdraftLimit)) {
            double newBalance = getBalance() - amount;
            if (newBalance < 0) {
                System.out.println("Overdraft used.");
            }
            // Set the new balance
            super.withdraw(amount);
        } else {
            System.out.println("Withdrawal denied. Amount exceeds balance and overdraft limit.");
        }
    }
}
