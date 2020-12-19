package org.kodluyoruz.designpatterns.strategy;

import java.util.Date;

public class CreditCardPayment implements Payment {

    private final String cardHolderName;
    private final String cvv2;
    private final String cardNumber;
    private final Date expireDate;

    public CreditCardPayment(String cardHolderName, String cvv2,
                             String cardNumber, Date expireDate) {
        this.cardHolderName = cardHolderName;
        this.cvv2 = cvv2;
        this.cardNumber = cardNumber;
        this.expireDate = expireDate;
    }

    @Override
    public void pay(Double amount) {
        System.out.println("Pay with Credit Card strategy amount  =  "+ amount);
    }
}
