package org.kodluyoruz.designpatterns.strategy;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Item item = new Item("Ayakkabi", 100.00);
        Item item2 = new Item("Parfüm", 200.00);

        Basket basket = new Basket();
        basket.addToBasket(item);
        basket.addToBasket(item2);



        basket.tryToPay(new PaypalPayment("PaypalUser", "Password"));
        basket.tryToPay(new CreditCardPayment("Baran", "1234",
                "1234-1234-1234-1234", new Date()));
        basket.tryToPay(new CashPayment());

    }
}
