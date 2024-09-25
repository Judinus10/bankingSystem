public class bankingSystem {

    public static void main(String[] args) {
        // Create a bank
        bank myBank = new bank("MyBank", null);

        // Create customers
        customer customer1 = new customer(101, "John Doe");
        customer customer2 = new customer(102, "Jane Smith");

        // Create accounts for customers
        account johnSavingsAccount = new savingAccount(1001, customer1, 500.00, 0.05);
        account janeCheckingAccount = new checkingAccount(1002, customer2, 1000.00, 200.00);

        // Add accounts to the bank
        myBank.addAccount(johnSavingsAccount);
        myBank.addAccount(janeCheckingAccount);

        // Perform some operations
        johnSavingsAccount.deposit(200.00); // John deposits money
        janeCheckingAccount.withdraw(150.00); // Jane withdraws money
        johnSavingsAccount.transfer(janeCheckingAccount, 100.00); // John transfers to Jane's account

        // Apply interest to John's savings account
        if (johnSavingsAccount instanceof savingAccount) {
            ((savingAccount) johnSavingsAccount).applyInterest();
        }

        // Check balances
        System.out.println("John's Balance: " + johnSavingsAccount.getBalance());
        System.out.println("Jane's Balance: " + janeCheckingAccount.getBalance());

        // Print transaction details (can be expanded to track real transactions)
        System.out.println("Operations completed.");
    
    }
}
