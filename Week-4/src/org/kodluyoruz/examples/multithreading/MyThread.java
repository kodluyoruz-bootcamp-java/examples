package org.kodluyoruz.examples.multithreading;

public class MyThread extends Thread {

    private Integer number;

    public MyThread() {
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
