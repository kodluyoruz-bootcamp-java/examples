package org.kodluyoruz.examples.inheritanceexamples.interfaces;

public class Main {

    public static void main(String[] args) {
        Discount blackFridayDiscount = new BlackFridayDiscount();
        System.out.println(blackFridayDiscount.calculateDiscount(100d)); // 80

        Discount firstLoginDiscount = new FirstLoginDiscount();
        System.out.println(firstLoginDiscount.calculateDiscount(100d)); // 0

        Discount anonymusInnerClassExample = new Discount() {
            @Override
            public double calculateDiscount(double amount) {
                if (amount > 0) {
                    return amount - 1;
                }
                return 0;
            }
        };
        System.out.println(anonymusInnerClassExample.calculateDiscount(100d)); // 99


        System.out.println("-----------------------------");

        Human human = new Human(true, "Barlas");
        human.move();
        human.run();

        Fish fish = new Fish(true, false);
        fish.startToMove();
        fish.stopMove();


    }
}
