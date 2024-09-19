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

    
}

