package org.kodluyoruz.examples.multithreading;

import org.kodluyoruz.examples.maps.Customer;

public class DepositCustomer implements Runnable {

    private CustomerService customerService;

    public DepositCustomer(CustomerService customerService) {
        this.customerService = customerService;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(1000);
            System.out.println("Customer balance before deposit -> " + customerService.getCustomer().getBalance());
            if(customerService.getCustomer().getBalance() > 0) {
                customerService.withdraw(200.00);
            }
            customerService.deposit(300.00);
            System.out.println("Customer balance after deposit -> " + customerService.getCustomer().getBalance());
        } catch (InterruptedException exception) {
            exception.printStackTrace();
        }


    }
}
