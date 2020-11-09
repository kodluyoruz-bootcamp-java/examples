package org.kodluyoruz.example;

import org.kodluyoruz.example.constructorexample.Student;

/**
 * Username = baranbuyuk
 * Date = 7.11.2020 14:54
 **/
public class KodluyoruzFirstClass {

    /**
     * public -> Bu sınıfa herkes, her yerden erişebilir.
     * proteced -> Bu sınıfa o classın bulunduğu paket içerisindeki herhangi bir sınıf erişebilir.
     * private -> Bu sınıfa başka hiç bir sınıftan erişim olamaz sadece private sınıfın alt sınıfları erişebilir.
     */


    public static void main(String[] args) {
        Student orenci = new Student();
    }

}
