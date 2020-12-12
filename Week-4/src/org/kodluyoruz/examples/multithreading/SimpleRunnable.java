package org.kodluyoruz.examples.multithreading;

public class SimpleRunnable implements Runnable {

    @Override
    public void run() {
        try {
            Thread.sleep(5000);
            System.out.printf("Running in %s %s ", Thread.currentThread().getName(), "Thread \n");
            System.exit(100);
        } catch (InterruptedException exception) {
            exception.printStackTrace();
        }
        System.out.println("My name is Baran");
    }
}
