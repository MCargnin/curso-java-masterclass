import java.util.ArrayList;

public class Branch {
    private String name;
    private ArrayList<Customer> customers;

    public Branch(String name) {
        this.name = name;
        this.customers = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public boolean newCustomer(String customerName, double transaction){
        if (findCustomer(customerName) != null){
            return false;
        }
        return this.customers.add(new Customer(customerName, transaction));
    }

    public boolean addCustomerTransaction(String customerName, double transaction){
        Customer tempCustomer = findCustomer(customerName);
        if (tempCustomer != null) {
            tempCustomer.addTransaction(transaction);
            return true;
        }
        else{
            return false;
        }
    }

    private Customer findCustomer(String customerName){
        for (int i = 0; i < this.customers.size(); i++){
            if(this.customers.get(i).getName().equals(customerName)){
                return this.customers.get(i);
            }
        }
        return null;
    }
}
