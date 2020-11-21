package org.kodluyoruz.examples.generics;

public class Transaction {

    /**
     * 0 -> işlem yapılmamış
     * 1 -> işlem başarılı
     * 2 -> işlem hatalı
     */
    private TransactionStatus transactionStatus;
}




enum TransactionStatus {
    SUCCESS(0), ERROR(1), WAITING(2);

    private final int id;

    TransactionStatus(int id) {
        this.id = id;
    }
}