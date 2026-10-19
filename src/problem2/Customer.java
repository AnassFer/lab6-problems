package problem2;

import java.util.ArrayList;

public class Customer {
    private String name;
    private ArrayList<Double> transactions;

    public Customer(String name){
        this.name = name;
        transactions = new ArrayList<Double>();
    }

    public ArrayList<Double> getTransactions() {
        return transactions;
    }

    public String getName() {
        return name;
    }

    public void addTransaction(Double transaction){
        transactions.add(transaction);
        double primTransaction = transaction; //unboxing
        System.out.println("Name : "+name+"\nTransaction amount: "+primTransaction+" MAD.");
    }

}
