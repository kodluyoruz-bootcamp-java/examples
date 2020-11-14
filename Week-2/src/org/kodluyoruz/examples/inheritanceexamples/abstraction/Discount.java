package org.kodluyoruz.examples.inheritanceexamples.abstraction;

public abstract class Discount {

    // Abstract sınıflardan new keywordü ile nesne oluşturamazsınız.
    // Abstract sınıfları kullanabilmek için en az bir implementasyonun olması gerekiyor.
    // Abstract sınıflar içerisinde abstract methodlar olabildiği gibi ( gövdesiz methodlar ) gövdeli metotlarda bulunabilir.
    // Interface ile abstrct sınıflar arasındaki fark interface sınıflarda gövde asla ( default dışında ) bulunmaz


    void printInstanceType() {
        System.out.println(this.getClass().getSimpleName());
    }

    abstract double calculateDiscount(double amount);


}
