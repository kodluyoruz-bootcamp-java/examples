package org.kodluyoruz.example.strings;

/**
 * Username = baranbuyuk
 * Date = 8.11.2020 14:31
 **/
public class StringExamples {

    static String name = "Hello World";
    static String name2 = "Hello World";

    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "Hello";

        String s3 = "Merhaba";
        String s4 = new String("Merhaba");

        System.out.println("s1 == s2 : " + (s1 == s2));
        System.out.println("s2 == s3 : " + (s2 == s3));
        System.out.println("s3 == s4 : " + (s3 == s4));

        System.out.println("s3 == s4 : " + s3.equals(s4));
    }
}
