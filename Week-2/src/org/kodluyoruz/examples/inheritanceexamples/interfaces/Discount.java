package org.kodluyoruz.examples.inheritanceexamples.interfaces;

public interface Discount {

    //Interfaceler new keywördüyle oluşturalamazlar.
    //Methodların body blockları yoktur.
    // interfacelerde private belirteçi kullanılamazlar.
    // interfacelerde methodlar default olarak publictir.

     double calculateDiscount(double amount);
}
