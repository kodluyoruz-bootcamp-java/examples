package org.kodluyoruz.designpatterns.singleton;

public class Main {
    public static void main(String[] args) {
        ConnectionFactory instance = ConnectionFactory.getInstance();
        System.out.println(instance);
        ConnectionFactory instance2 = ConnectionFactory.getInstance();
        System.out.println(instance2);
    }
}
