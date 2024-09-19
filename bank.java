import java.util.ArrayList;
import java.util.List;

public class bank {
    private String bankName;
    private List<Account> account ;

    //Constructor
    public bank (String bankName , List<Account> account){
        this.bankName = bankName;
        this.account= new ArrayList<>();
    }

    // Add a new account to the bank
    public void addAccount(Account account) {
        accounts.add(account);
        System.out.println("Account added for: " + account.getCustomer().getName());
    }

}

