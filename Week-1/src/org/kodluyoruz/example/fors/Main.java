package org.kodluyoruz.example.fors;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

/**
 * Username = baranbuyuk
 * Date = 8.11.2020 13:07
 **/
public class Main {


    public static void main(String[] args) {
        /**
         * 1. block initialization
         * 2. block condition
         * 3. operation
         */
        List<Customer> customers = getCustomersFromDatabase();

        System.out.println("FOR DONGUGUSU ILE");
        for (int i = 0; i < customers.size(); i++) {

            Customer customer = customers.get(i);
            if(customer.name == "Mehmet") {
                sendEmail(customer.email, customer.name);
                break;
            }


        }
        System.out.println("WHILE DONGUGUSU ILE");
        int i = 0;

        while (i < customers.size()) {
            Customer customer = customers.get(i);
            sendEmail(customer.email, customer.name);
            i++;
        }

        System.out.println("DO-WHILE DONGUGUSU ILE");

        int i2 = 0;
        do {
            Customer customer = customers.get(i2);
            sendEmail(customer.email, customer.name);
            i2++;
        } while (i2 < customers.size());


    }

    public static void sendEmail(String emailAddress, String message) {
        System.out.printf("Email %s kullanıcısına %s " +
                "mesaj içeriği ile gönderildi.\n", emailAddress, message);
    }

    public static List<Customer> getCustomersFromDatabase() {
        //fake database
        Customer customer = new Customer("Mehmet", new Date(), "email@email.com");
        Customer customer2 = new Customer("Ahmet", new Date(), "email@email.com");
        Customer customer3 = new Customer("Işıl", new Date(), "email@email.com");
        Customer customer4 = new Customer("Sevgi", new Date(), "email@email.com");
        Customer customer5 = new Customer("Veli", new Date(), "email@email.com");
        Customer customer6 = new Customer("Alia", new Date(), "email@email.com");
        List<Customer> customers = new ArrayList<>();
        customers.addAll(Arrays.asList(customer,
                customer2, customer3, customer4,
                customer5, customer6));
        return customers;
    }
}
