package problem2;

import java.util.ArrayList;

public class Bank {
    private ArrayList<Customer> customers;

    public Bank(){
        customers = new ArrayList<Customer>();
    }

    public void addCustomer(Customer customer){
        customers.add(customer);
        // we can also loop to check if the customer exists
    }

    public void addTransaction(Customer cs1, Customer cs2, double amount){
        Double wrapDoubleDebit = -amount;
        Double wrapDouble = amount;
        cs1.addTransaction(wrapDoubleDebit);
        cs2.addTransaction(wrapDouble);
    }

    public static void main(String[] args) {
        Bank bank = new Bank();
        Customer cs1 = new Customer("Hassan");
        Customer cs2 = new Customer("Ahmed");
        bank.addCustomer(cs1);
        bank.addCustomer(cs2);
        bank.addTransaction(cs1,cs2,100);
    }
}
