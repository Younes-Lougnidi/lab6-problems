package problem2;

import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<Customer> customers;
    public Bank(String name){
        this.name = name;
        this.customers = new ArrayList<Customer>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }
    public void addCustomer(Customer customer){
        for(Customer c : customers){
            if(c.getName().equals(customer.getName())){
                System.out.println("The customer already exists");
                return;
            }
        }
        customers.add(customer);
    }
    public void addTransaction(Customer customer , Double trans){
        for(Customer c : customers){
            if(c.getName().equals(customer.getName())){
                c.addTransaction(trans);
                return;
            }
        }
        System.out.println("Customer not found");
    }
    public void print(){
        for(Customer c: customers ){
            System.out.print(c.getName() + " has transaction: [");
            for(Double trans : c.getTransactions()){
                double d = trans.doubleValue();
                System.out.format("%.2f ",d);
            }
            System.out.print("]\n");
        }
    }
}
