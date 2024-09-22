public class transaction {
    private int transactionID;
    private Date date;
    private String type;
    private double amount;
    private int fromAccNum;
    private int toAccNum;

    public transaction(int transactionID, Date date, String type, double amount, int fromAccNum, int toAccNum){
        this.transactionID=transactionID;
        this.date=date;
        this.type=type;
        this.amount=amount;
        this.fromAccNum=fromAccNum;
        this.toAccNum=toAccNum;
    }
}
