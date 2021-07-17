package data;

import model.Customer;

import java.util.ArrayList;
import java.util.List;

public class CustomerDB {
    public List<Customer> Customers;
    public static int count = 0;

    public CustomerDB(){
        Customers = new ArrayList<>();
    }

    public void add(Customer customer){
        customer.setCustomer_id(count++);
        Customers.add(customer);
    }

    public Customer findByidCustomer(int id){
        for(int i =  0; i < Customers.size(); i++){
            if(Customers.get(i).getCustomer_id() == id){
                return Customers.get(i);
            }
        }
        return null;
    }



}
