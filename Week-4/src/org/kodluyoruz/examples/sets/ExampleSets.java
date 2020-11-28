package org.kodluyoruz.examples.sets;

import org.kodluyoruz.examples.Customer;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class ExampleSets {
    public static void main(String[] args) {

        Customer google = new Customer(1, "Google", 100.00);
        Customer amazon = new Customer(2, "Amazon", 200.00);
        Customer spaceX = new Customer(3, "SpaceX", 300.00);
        Customer samsung = new Customer(4, "Samsung", 400.00);

        Set<Customer> customers = new HashSet<>();
        customers.add(google);
        customers.add(amazon);
        customers.add(spaceX);
        customers.add(samsung);
        customers.add(new Customer(5, "Apple", 100000.00));
        customers.add(new Customer(5, "Apple2", 2));


        //printAll(customers);



        printAll(customers);



    }

    static void printAll(Collection<?> collection) {
        if (!collection.isEmpty()) {
            for (Object object : collection) {
                System.out.println(object.toString());
            }
        }
    }
}
