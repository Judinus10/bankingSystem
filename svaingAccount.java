public class svaingAccount extends account  {
    private double interestRate;

    public SavingsAccount(int accountNum, Customer customer, double balance, double interestRate) {
        super(accountNum, customer, balance); 
        this.interestRate = interestRate;
    }
}
