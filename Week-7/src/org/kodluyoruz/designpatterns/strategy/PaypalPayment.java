package org.kodluyoruz.designpatterns.strategy;

public class PaypalPayment implements Payment {

    private final String userName;
    private final String password;

    public PaypalPayment(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    @Override
    public void pay(Double amount) {
        System.out.println("Pay with PaypalStrategy amount  =  "+ amount);
    }
}
