package org.kodluyoruz.examples.enumexamples;

public class Order {

    public OrderStatus orderStatus = OrderStatus.ACCEPTED;

    public Order() {
    }

    public Order(OrderStatus orderStatus) {
        this.orderStatus = orderStatus;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderStatus=" + orderStatus +
                '}';
    }
}
