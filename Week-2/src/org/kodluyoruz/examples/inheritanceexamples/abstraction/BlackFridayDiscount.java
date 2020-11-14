package org.kodluyoruz.examples.inheritanceexamples.abstraction;

public class BlackFridayDiscount extends Discount {


    @Override
    public double calculateDiscount(double amount) {
        if (amount > 0) {
            System.out.println("Blackfriday indirimi uygulandı.");
            return amount - 10;
        }
        return 0;
    }
}
