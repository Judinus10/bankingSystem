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
        if(amount>0){
            balance+=amount;
            System.out.println("Depsit "+amount+" to Account "+ accountNum);
        }else{
            System.out.println("Double amount must be in positive!");
        }
    }
}
