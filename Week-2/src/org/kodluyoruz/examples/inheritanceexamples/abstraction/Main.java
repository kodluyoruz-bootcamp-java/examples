package org.kodluyoruz.examples.inheritanceexamples.abstraction;

public class Main {


    public static void main(String[] args) {
        Discount fridayDiscount = new BlackFridayDiscount();
        System.out.println(fridayDiscount.calculateDiscount(20.00));
        fridayDiscount.printInstanceType();

        Discount defaultDiscount = new DefaultDiscount();
        System.out.println(defaultDiscount.calculateDiscount(20.00));
        defaultDiscount.printInstanceType();


        Discount runDiscount = new Discount() {
            @Override
            void printInstanceType() {
                System.out.println("Inner Class");
            }

            @Override
            double calculateDiscount(double amount) {
                if(amount>0) {
                   return 1;
                }
                return 0;
            }
        };
        System.out.println(runDiscount.calculateDiscount(20.00));
        runDiscount.printInstanceType();

    }
}
