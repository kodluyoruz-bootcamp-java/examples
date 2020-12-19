package org.kodluyoruz.designpatterns.strategy;

public class CashPayment implements Payment {


    @Override
    public void pay(Double amount) {
        System.out.println("Pay with cash, amount  =  "+ amount);
    }
}
