package org.kodluyoruz.examples.exceptions;

import java.util.Scanner;

public class Main {

   /* public static void main(String[] args) {
        // try :
        // catch :
        // finally :

        try {
            int number = Integer.parseInt("12");
            Class.forName("org.kodluyoruz.examples.arrayexamples.ArrayExample2");
        } catch (NumberFormatException | ClassNotFoundException exception) {
            if (exception instanceof NumberFormatException) {
                System.out.println("Numaramız hatalı..");
            }
            if (exception instanceof ClassNotFoundException) {
                System.out.println("Böyle bir class bulunamadi..");
            }
        }ls
    }*/

    public static void main(String[] args) {
        try {
            UserService.checkUserPassword("1235");
        } catch (InvalidPasswordException exception) {
            System.out.println(exception.getMessage());

        }

    }
}
