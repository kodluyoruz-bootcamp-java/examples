package org.kodluyoruz.example.fors;

/**
 * Username = baranbuyuk
 * Date = 8.11.2020 14:10
 **/
public class NumbersAnsLiterals {

    public static Integer integerYas = 12;
    public static Long longYas = 12L;
    public static Float floatYas = 12F;
    public static Short shortYas = 12;
    public static Double doubleYas = 12.00;

    public static void main(String[] args) {
        System.out.println("Long Value of Integer :" + integerYas.longValue());
        System.out.println("Byte Value of Integer :" + integerYas.byteValue());
        System.out.println("Float Value of Integer :" + integerYas.floatValue());
        System.out.println("Short Value of Integer :" + integerYas.shortValue());


        System.out.println("Long Value of Long :" + longYas.intValue());
        System.out.println("Byte Value of Long :" + longYas.byteValue());
        System.out.println("Float Value of Long :" + longYas.floatValue());
        System.out.println("Short Value of Long :" + longYas.shortValue());

        System.out.println("is eqaul to 13 " + (integerYas.compareTo(12) == 0));
        System.out.println("is eqaul to 13 " + (longYas.compareTo(12L) == 0));
        System.out.println("is eqaul to 13 " + (floatYas.compareTo(12F) == 0));
        System.out.println("is eqaul to 13 " + (shortYas.compareTo(Short.valueOf("12")) == 0));
        System.out.println("is eqaul to 13 " + (doubleYas.compareTo(12D) == 0));

        Double ondalikliSayi = 12.07;
        System.out.println(Math.round(ondalikliSayi));
        System.out.println(Math.ceil(ondalikliSayi));

    }
}
