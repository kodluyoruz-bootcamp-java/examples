package org.kodluyoruz.examples.overleadingexamples;

public class Main {

    public static void main(String[] args) {

        System.out.println("1 + 2 = " + Calculation.sum(1, 2));
        System.out.println("1 + 2 + 3 = " + Calculation.sum(1, 2, 3));
        System.out.println("1 + 2 + 3 + 4 + 5 = " + Calculation.sum(new int[]{1, 2, 3, 4, 5}));
        System.out.println("1 + 2 + 3 + 4 = " + Calculation.sum(1, 2, 3, 4));
        System.out.println("25 * 12  = " + Calculation.multiply(25, 12));

    }
}
