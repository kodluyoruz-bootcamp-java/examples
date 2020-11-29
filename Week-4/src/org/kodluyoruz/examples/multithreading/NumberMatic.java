package org.kodluyoruz.examples.multithreading;

public class NumberMatic implements Runnable {

    private Integer number;

    public NumberMatic() {
        this.number = 0;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(50);
            synchronized (this) {
                number = number + 1;
                System.out.println("Yeni numara = " + number);
            }

        } catch (InterruptedException exception) {
            exception.printStackTrace();
        }
    }
}
