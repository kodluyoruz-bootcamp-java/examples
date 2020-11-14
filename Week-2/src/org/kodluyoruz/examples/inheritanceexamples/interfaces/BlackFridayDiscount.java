package org.kodluyoruz.examples.inheritanceexamples.interfaces;

public class BlackFridayDiscount implements Discount{


    @Override
    public double calculateDiscount(double amount) {
        if(amount>0){
            return amount - 20;
        }
        return 0;
    }
}
