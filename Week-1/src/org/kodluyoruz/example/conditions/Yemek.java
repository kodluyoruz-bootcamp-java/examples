package org.kodluyoruz.example.conditions;

/**
 * Username = baranbuyuk
 * Date = 8.11.2020 11:38
 **/
public class Yemek {

    float saltRatio;

    public Yemek(float saltRatio) {
        this.saltRatio = saltRatio;
    }

    public void isSalted() {
        if (saltRatio > 0.8f) {
            System.out.println("Tuzlu");
        } else if (saltRatio > 0.5f && saltRatio <= 0.7f) {
            System.out.println("Orta Tuzlu");
        } else {
            System.out.println("Tuzsuz");
        }
    }
}
