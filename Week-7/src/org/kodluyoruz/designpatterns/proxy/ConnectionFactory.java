package org.kodluyoruz.designpatterns.proxy;

public class ConnectionFactory {

    private static ConnectionFactory INSTANCE;

    static {
        INSTANCE = new ConnectionFactory();
    }

    private ConnectionFactory() {

    }

    public static ConnectionFactory getInstance() {
        synchronized (INSTANCE) {
            return INSTANCE;
        }
    }
}
