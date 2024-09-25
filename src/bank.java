import java.util.ArrayList;
import java.util.List;

public class bank {
    private String bankName;
    private List<account> accounts ;

    //Constructor
    public bank (String bankName, List<account> accounts){
        this.bankName = bankName;
        this.accounts= new ArrayList<>();
    }

    // Add a new account to the bank
    public void addAccount(account accoun) {
        accounts.add(accoun);
        System.out.println("Account added for: " + accoun.getCustomer().getname());
    }

    // Retrieve an account by account number
    public account getAccount(int accountNumber) {
        for (account accounts : accounts) {
            if (accounts.getAccountNumber() == accountNumber) {
                return accounts;
            }
        }
        System.out.println("Account not found.");
        return null;
    }

     // Get the name of the bank
     public String getBankName() {
        return bankName;
    }

    // List all accounts in the bank
    public void listAccounts() {
        for (account accounts : accounts) {
            System.out.println("Account Number: " + accounts.getAccountNumber() + 
                               ", Customer: " + accounts.getCustomer().getname() +
                               ", Balance: " + accounts.getBalance());
        }
    }
}

