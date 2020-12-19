package org.kodluyoruz.designpatterns.strategy;

import java.util.ArrayList;
import java.util.List;

public class Basket {

    private List<Item> items = new ArrayList<>();

    public void addToBasket(Item item) {
        items.add(item);
    }

    public void tryToPay(Payment paymentStrategy) {
        double totalBasketAmount = 0;
        for (Item item : items) {
            totalBasketAmount += item.getPrice();
        }
        paymentStrategy.pay(totalBasketAmount);
    }
}
