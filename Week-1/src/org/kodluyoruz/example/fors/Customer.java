package org.kodluyoruz.example.fors;

import java.util.Date;

/**
 * Username = baranbuyuk
 * Date = 8.11.2020 13:10
 **/
public class Customer {

    public String email;
    public String name;
    public Date birthDate;

    public Customer(String name, Date birthDate, String email) {
        this.name = name;
        this.birthDate = birthDate;
        this.email = email;
    }
}
