package org.kodluyoruz.example.operators;

/**
 * Username = baranbuyuk
 * Date = 8.11.2020 11:11
 **/
public class BasicOperators {

    public static String className = "Mehmet";

    public static void main(String[] args)  {
        String methodName = "Mehmet";

        int a = 10;
        int b = 100;

        System.out.println("İki sayının toplamı : " + a + b);
        System.out.println("İki sayının çıkarma işlemi : " + (a - b));
        System.out.println("İki sayının çarpma işlemi : " + (a * b));
        System.out.println("İki sayının bölme işlemi : " + (a / b));
        System.out.println("Mod alma " + (a % b));
        System.out.println("Arttırma  işlemi :" + (++a));
        System.out.println("Azaltma  işlemi :" + (--a));


        boolean a2 = true;
        boolean b2 = false;

        System.out.println("a2 && b2 = " + (a2 && b2));

        System.out.println("a2 || b2 = " + (a2 || b2));

        System.out.println("!(a2 && b2) = " + !(a2 && b2));


        int a3 = 100;
        int b3 = 200;

        System.out.println("a3 > b3 : " + (a3 > b3 ? "Doğru" : "Yanlış"));

        System.out.println(methodName + " " + className);

        System.out.println("String veri tipinde mi?" + (className instanceof String));
    }
}

