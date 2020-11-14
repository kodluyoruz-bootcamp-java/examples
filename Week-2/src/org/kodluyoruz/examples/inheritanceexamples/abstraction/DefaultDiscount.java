package org.kodluyoruz.examples.inheritanceexamples.abstraction;

public class DefaultDiscount extends Discount {

    @Override
    double calculateDiscount(double amount) {
        if (amount > 0) {
            System.out.println("Normal indirim uygulandı.");
            return amount - 2;
        }
        return 0;
    }
}
