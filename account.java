public class account {
    
    private int accountNum;
    private double balance;
    public customer customer;

    public account (int accountNum, double balance, customer customer){
        this.accountNum=accountNum;
        this.balance=balance;
        this.customer=customer;
    }
}
