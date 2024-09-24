public class bankingSystem {
    public static void main(String[] args){
        Bank myBank = new Bank("MyBank");

        Customer customer1 = new Customer("John Doe", 101);
        Customer customer2 = new Customer("Jane Smith", 102);

        Account johnAccount = new SavingsAccount(1001, customer1, 500.00, 0.05);
        Account janeAccount = new CheckingAccount(1002, customer2, 1000.00, 200.00);
    }
}
