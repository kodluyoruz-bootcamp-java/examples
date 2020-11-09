package org.kodluyoruz.example.conditions;

/**
 * Username = baranbuyuk
 * Date = 8.11.2020 11:47
 **/
public class Apartment {

    public int baseNumber;

    public void getBaseInformation() {

        switch (baseNumber) {
            case 0: {
                System.out.println("Zemin Kattayım");
                break;
            }
            case 1: {
                System.out.println("Birinci Kattayım.");
                break;
            }
            case 2: {
                System.out.println("İkinci Kattayım");
                break;
            }
            default: {
                System.out.println("Kat numaramı bilmiyorum");
                break;
            }
        }
    }

    public void increaseBaseNumber() {
        baseNumber++;
    }

    public void decreaseBaseNumber() {
        baseNumber--;
    }

    public void changeBaseNumber(int newBaseNumber) {
        baseNumber = newBaseNumber;
    }
}
