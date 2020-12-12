package org.kodluyoruz.examples;

public class Test {

    public static void main(String[] args) {
        if (args.length > 0) {
            for (int i = 0; i < args.length; i++) {
                System.out.printf("Pamater %i \n", args[i]);
            }
        }
    }
}