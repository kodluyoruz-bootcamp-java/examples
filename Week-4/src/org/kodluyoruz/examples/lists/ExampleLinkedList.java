package org.kodluyoruz.examples.lists;

import java.util.LinkedList;
import java.util.List;

public class ExampleLinkedList {
    public static void main(String[] args) {
        List<String> linkedCustomerList = new LinkedList<>();
        linkedCustomerList.add("Google");
        linkedCustomerList.add("Amazon");
        linkedCustomerList.add("Huawei");
        linkedCustomerList.add("Samsung");
        linkedCustomerList.add("SpaceX");

        System.out.println("Google index at linkedCustomerList : " + linkedCustomerList.get(0));



    }
}
