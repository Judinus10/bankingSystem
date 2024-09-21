public class account {
    
    private int accountNum;
    private double balance;
    public customer customer;

    public account (int accountNum, double balance, customer customer){
        this.accountNum=accountNum;
        this.balance=balance;
        this.customer=customer;
    }

    public void deposit (double amount){
        if (amount>100){
            if(amount>0){
                balance+=amount;
                System.out.println("Depsit "+amount+" to Account "+ accountNum);
            }else{
                System.out.println("Double amount must be in positive!");
            }    
        }else{
            System.out.println("Deposit amount must more than 100");
        }
        
    }

    public void withdraw(double amount){
        if(amount>0){
            if(amount<balance){
                balance-=amount;
                System.out.println("Withdraw "+amount+" From Account No "+accountNum);
            }else{
                System.out.println("Insufficient Balance!");
            }
        }else{
            System.out.println("Invalid amount!");
        }
        
    }

    public void transfer(account toAccount, double amount){
        if(amount>0){
            if(amount<balance){
                balance-=amount;
                toAccount.balance+=amount;
                System.out.println("Transfered "+amount+" from account no "+this.accountNum+" to account "+toAccount.accountNum);
            }else{
                System.out.println("Transfer failed due to Insufficient balance");
            }
        }else{
            System.out.println("Transfer failed due to invalid amount");
        }
    }
}
