package org.kodluyoruz.designpatterns.singleton;

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
