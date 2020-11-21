package org.kodluyoruz.examples.generics;

public class Phone {

    private Brand brand;

    public Phone(Brand brand) {
        this.brand = brand;
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }
}


enum Brand {
    APPLE, SAMSUNG;
}