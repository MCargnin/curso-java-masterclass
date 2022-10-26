import java.util.ArrayList;

public class Bank {
    // write code here
    private String name;
    private ArrayList<Branch> branches;

    public Bank (String name){
        this.name = name;
        this.branches = new ArrayList<>();
    }

    public boolean addBranch(String branchName){
        if(findBranch(branchName) != null){
            return false;
        }
        return this.branches.add(new Branch(branchName));
    }
    public boolean addCustomer(String branchName, String customer, double transaction){
        Branch branch = findBranch((branchName));
        if (branch == null){
            return false;
        }
        return branch.newCustomer(customer, transaction);
    }
    public boolean addCustomerTransaction(String branchName, String customer, double transaction){
        Branch branch = findBranch((branchName));
        if (branch == null){
            return false;
        }
        return branch.addCustomerTransaction(customer, transaction);
    }
    private Branch findBranch(String branchName){
        for(int i=0; i<this.branches.size(); i++) {
            if(this.branches.get(i).getName().equals(branchName)){
                return this.branches.get(i);
            }
        }
        return null;
    }
    public boolean listCustomers(String branchName, boolean printTransaction){
        //if(findBranch(branchName).getCustomers() != null){
            //System.out.println("Customer details for branch " + branchName);
        //}
        for(int i=0; i<this.branches.size(); i++) {
            if(this.branches.get(i).getName().equals(branchName)){
                System.out.println("Customer details for branch " + branchName);
                Branch branch = this.branches.get(i);
                ArrayList<Customer> customer = branch.getCustomers();
                ArrayList<Double> transactions;
                for (int j = 0; j<customer.size(); j++){
                    System.out.println("Customer: " + customer.get(j).getName() + "[" + (j+1) + "]");
                    transactions = customer.get(j).getTransactions();
                    if (printTransaction == true){
                        System.out.println("Transactions");
                        for (int k = 0; k<transactions.size(); k++){
                            System.out.println("[" + (k+1) + "]  Amount " + transactions.get(k));
                        }
                    }
                }
                //System.out.println("Customer: " + this.branches.get(i).getName() + "[" + i + "]");

                //return this.branches.get(i);
                return true;
            }
        }
        return false;
    }
}