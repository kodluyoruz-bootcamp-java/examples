package org.kodluyoruz.examples.multithreading;

import org.kodluyoruz.examples.maps.Customer;

public class CustomerService {

    private Customer customer;

    public CustomerService(Customer customer) {
        this.customer = customer;
    }

    public void deposit(Double amount) {
        customer.setBalance(customer.getBalance() + amount);
    }

    public void withdraw(Double amount) {
        customer.setBalance(customer.getBalance() - amount);
    }

    public Customer getCustomer() {
        return customer;
    }
}
