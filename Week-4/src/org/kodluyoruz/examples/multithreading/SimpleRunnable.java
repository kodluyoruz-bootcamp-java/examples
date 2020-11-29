package org.kodluyoruz.examples.multithreading;

public class SimpleRunnable implements Runnable {
    private SimpleCounter simpleCounter = new SimpleCounter();

    @Override
    public void run() {
        try {
            Thread.sleep(5000);
            simpleCounter.incrementCounterWithThreadSafety(Thread.currentThread().getName());
        } catch (InterruptedException exception) {
            exception.printStackTrace();
        }
    }
}
