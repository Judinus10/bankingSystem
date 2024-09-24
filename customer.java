public class Customer {

    private int customerID;
    public String name;

    public Customer (int customerID, String name){
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
