public class customer {

    private int customerID;
    public String name;

    public customer (int customerID, String name){
        this.customerID=customerID;
        this.name=name;
    }

    public int getCustomerID(){
        return customerID;
    }

    public String getname(){
        return name;
    }
}
