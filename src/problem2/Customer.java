package problem2;

import java.util.ArrayList;

public class Customer {
    private String name;
    private ArrayList<Double> transactions;
    public Customer(String name){
        this.name = name;
        transactions = new ArrayList<Double>();
    }
    public void addTransaction(Double trans){
        transactions.add(trans);
    }

    public String getName() {
        return name;
    }

    public ArrayList<Double> getTransactions() {
        return transactions;
    }
}
