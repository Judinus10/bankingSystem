import java.util.Date;

public class transaction {
    private int transactionID;
    private Date date;
    private String type;
    private double amount;
    private int fromAccNum;
    private int toAccNum;

    // Constructor for deposit/withdrawal transactions
    public Transaction(int transactionID, String type, double amount, int accountNumber) {
        this.transactionID = transactionID;
        this.date = new Date(); 
        this.type = type;
        this.amount = amount;
        this.fromAccountNumber = accountNumber;
    }

    // Constructor for transfer transactions
    public Transaction(int transactionID, String type, double amount, int fromAccountNumber, int toAccountNumber) {
        this.transactionID = transactionID;
        this.date = new Date(); 
        this.type = type;
        this.amount = amount;
        this.fromAccountNumber = fromAccountNumber;
        this.toAccountNumber = toAccountNumber;
    }

    public int getTransactionID() {
        return transactionID;
    }

    public Date getDate() {
        return date;
    }

    public String getType() {
        return type;
    }

    public double getAmount() {
        return amount;
    }

    public int getFromAccountNumber() {
        return fromAccNum;
    }

    public int getToAccountNumber() {
        return toAccNum;
    }

    public void printTransaction() {
        if (type.equals("transfer")) {
            System.out.println("Transaction ID: " + transactionID + ", Type: " + type + ", Amount: " + amount +
                    ", From Account: " + fromAccNum + ", To Account: " + toAccNum + ", Date: " + date);
        } else {
            System.out.println("Transaction ID: " + transactionID + ", Type: " + type + ", Amount: " + amount +
                    ", Account: " + fromAccNum + ", Date: " + date);
        }
    }
}
