package org.kodluyoruz.example.conditions;

/**
 * Username = baranbuyuk
 * Date = 8.11.2020 11:35
 **/
public class Main {

    public static void main(String[] args) {
        Student ogrenci = new Student(51, "Baran");
        System.out.println("Öğrencinin yaşı 50'den büyük mü? : "
                + ogrenci.isGreaterThan50());

        Yemek yemek = new Yemek(0.7f);
        yemek.isSalted();

        Apartment ap = new Apartment();
        ap.getBaseInformation(); // zemint katta
        ap.increaseBaseNumber(); // +1
        ap.getBaseInformation(); // Birinci Katta
        ap.decreaseBaseNumber();
        ap.getBaseInformation();
        ap.changeBaseNumber(10);
        ap.getBaseInformation();
    }
}
