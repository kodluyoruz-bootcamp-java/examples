package org.kodluyoruz.examples.multithreading;

import org.kodluyoruz.examples.maps.Customer;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {

        /**
         * 1- Thread sınıf extends
         * 2- Runnable implementation
         */
        /** Runnable runnable = new SimpleRunnable();
        Thread t1 = new Thread(runnable);
        Thread t2 = new Thread(runnable);
        Thread t3 = new Thread(runnable);
        Thread t4 = new Thread(runnable);
        Thread.activeCount();

        t1.start();
        t2.start();
        t3.start();
        t4.start(); **/

        ExecutorService executorService = Executors.newFixedThreadPool(10);

        Runnable runnable = new SimpleRunnable();

        executorService.execute(runnable);
        executorService.execute(runnable);
        executorService.execute(runnable);
        executorService.execute(runnable);
        executorService.execute(runnable);

        executorService.execute(runnable);
        executorService.execute(runnable);
        executorService.execute(runnable);
        executorService.execute(runnable);
        executorService.execute(runnable);

        executorService.execute(runnable);
        executorService.execute(runnable);
        executorService.execute(runnable);

        executorService.shutdown();

    }
}
