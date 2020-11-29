package org.kodluyoruz.examples.multithreading;

import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class SimpleCounter {
    private volatile int counter;
    private final ReadWriteLock readWriteLock = new
            ReentrantReadWriteLock();

    public SimpleCounter() {
        this.counter = 0;
    }

    public void incrementCounterWithoutThreadSafety(String threadName) {
        try {
            Thread.sleep(1000);
            this.counter++;
            System.out.println("Counter was updated to '" + this.counter + "' from " + threadName);
        } catch (InterruptedException exception) {
            exception.printStackTrace();
        }


    }

    public void incrementCounterWithThreadSafety(String threadName) {
        this.readWriteLock.writeLock().lock();
        try {
            this.counter++;
            System.out.println("Counter was updated to '" +
                    this.counter + "' from " + threadName);
        } finally {
            this.readWriteLock.writeLock().unlock();
        }
    }

    public int readCounterWithThreadSafety() {
        this.readWriteLock.readLock().lock();
        try {
            return this.counter;
        } finally {
            this.readWriteLock.readLock().unlock();
        }
    }
}