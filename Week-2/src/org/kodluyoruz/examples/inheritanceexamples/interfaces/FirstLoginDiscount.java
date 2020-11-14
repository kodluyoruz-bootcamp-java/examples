package org.kodluyoruz.examples.inheritanceexamples.interfaces;

public class FirstLoginDiscount implements Discount{

    @Override
    public double calculateDiscount(double amount) {
        return 0;
    }
}
