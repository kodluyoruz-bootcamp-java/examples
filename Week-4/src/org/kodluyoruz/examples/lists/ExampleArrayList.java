package org.kodluyoruz.examples.lists;

import java.util.ArrayList;
import java.util.List;

public class ExampleArrayList {

    public static void main(String[] args) {
        List<String> customerList = new ArrayList<>();
        customerList.add("Google");
        customerList.add("Huawei");
        customerList.add("Apple");
        customerList.add("Amazon");

        System.out.println("Size of List : " + customerList.size());
        System.out.println("is Empty list? : " + customerList.isEmpty());
        System.out.println("Is contains Huawei company? " + customerList.contains("Huawei"));
        System.out.println("Is contains number 10? " + customerList.contains(10L));
        System.out.println("Get Object[] from the list : ");
        Object[] customerObjects = customerList.toArray();

        for (Object o : customerObjects) {
            System.out.println(o.toString());
        }

        System.out.println("Removed from the Customer List : " + customerList.remove("Google"));
        System.out.println("Is contains Google company? " + customerList.contains("Google"));
        for (String s : customerList) {
            System.out.println(s);
        }

        List<String> additionalCustomerList = new java.util.ArrayList<>();
        additionalCustomerList.add("SpaceX");


        customerList.addAll(additionalCustomerList);

        for (String s : customerList) {
            System.out.println(s);
        }

        System.out.println("--- Clear customer list");

        additionalCustomerList.clear();
        for (String s : additionalCustomerList) {
            System.out.println(s);
        }

        List<String> removeCustomerList = new java.util.ArrayList<>();
        removeCustomerList.add("Apple");
        removeCustomerList.add("Amazon");


        customerList.removeAll(removeCustomerList);

        for (String s : customerList) {
            System.out.println(s);
        }


        System.out.println("Company which is index number of 0 : " + customerList.get(0));
        System.out.println("Company which is index number of 1 : " + customerList.get(1));

        System.out.println("Index of Huawei in the customer list :" + customerList.indexOf("Huawei"));
        System.out.println("Index of SpaceX in the customer list :" + customerList.indexOf("SpaceX"));
        System.out.println("Index of none in the customer list :" + customerList.indexOf("none"));


        System.out.println("Removed Huawei from the customer list -> " + customerList.remove(0));

        customerList.clear();
        customerList.add("Huawei"); //0
        customerList.add("Amazon"); //1
        customerList.add("Google"); // 2
        customerList.add("Spotify"); // 3
        System.out.println("Index of Huawei in the customer list :" + customerList.indexOf("Huawei"));

        List<String> subListOfCustomers = customerList.subList(2, 3); // Huawei
        System.out.println(subListOfCustomers);


    }
}
