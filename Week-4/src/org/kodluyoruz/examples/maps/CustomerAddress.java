package org.kodluyoruz.examples.maps;

import java.util.Objects;

public class CustomerAddress {

    private int id;
    private String address;

    public CustomerAddress(int id, String address) {
        this.id = id;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CustomerAddress that = (CustomerAddress) o;
        return id == that.id &&
                Objects.equals(address, that.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, address);
    }

    @Override
    public String toString() {
        return "CustomerAddress{" +
                "id=" + id +
                ", address='" + address + '\'' +
                '}';
    }
}
