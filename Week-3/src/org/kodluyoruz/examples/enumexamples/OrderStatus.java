package org.kodluyoruz.examples.enumexamples;

public enum OrderStatus {
    ACCEPTED(1, "Sipariş Kabul Edildi"),
    REJECTED(2, "Sipariş Reddedildi"),
    APPROVED(3, "Sipariş Onaylandı");

    private final String statusValue;
    private final int id;

    OrderStatus(int id, String statusValue) {
        this.id = id;
        this.statusValue = statusValue;
    }

    public String getStatusValue() {
        return statusValue;
    }

    public int getId() {
        return id;
    }
}
