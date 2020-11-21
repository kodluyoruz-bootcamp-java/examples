package org.kodluyoruz.examples.enumexamples;

public class Main {
    public static void main(String[] args) {

        Order order = new Order();
        System.out.println(order.toString());

        Order order2 = new Order(OrderStatus.REJECTED);
        System.out.println(order2.toString());

        System.out.println(OrderStatus.REJECTED.ordinal());

        System.out.println(OrderStatus.ACCEPTED.getStatusValue());
        System.out.println(OrderStatus.ACCEPTED.getId());

        OrderStatus[] orderStatuses = OrderStatus.values();


        for (OrderStatus osVariable : orderStatuses) {
            System.out.println("NAme : " + osVariable.name());
            System.out.println("Ordinal : " + osVariable.ordinal());
            System.out.println("ID : " + osVariable.getId());
            System.out.println("Status Value : " + osVariable.getStatusValue());
        }
    }
}
