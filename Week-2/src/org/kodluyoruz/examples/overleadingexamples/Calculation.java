package org.kodluyoruz.examples.overleadingexamples;

public final class Calculation {

    private Calculation() {

    }

    public static int sum(int a, int b) {
        return a + b;
    }

    public static float sum(float a, float b) {
        return a + b;
    }

    public static int sum(int a, int b, int c) {
        return a + b + c;
    }

    public static float sum(float a, float b, float c) {
        return a + b + c;
    }

    public static double multiply(double a, double b) {
        return a * b;
    }

    public static double multiply(double a, double b, double c) {
        return a * b * c;
    }

    public static int sum(int[] numbers) {
        int result = 0;
        for (int i = 0; i < numbers.length; i++) {
            result += numbers[i];
        }
        return result;
    }

    public static int sum(Integer... numbers) {
        int result = 0;
        for (int i = 0; i < numbers.length; i++) {
            result += numbers[i];
        }
        return result;
    }


}
