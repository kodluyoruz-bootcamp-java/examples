package org.kodluyoruz.examples.db;

import lombok.extern.slf4j.Slf4j;
import org.kodluyoruz.examples.model.dao.Customer;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Objects;
import java.util.stream.Collectors;

@Slf4j
public class LocalDB {

    private static final Collection<Customer> CUSTOMERS = new ArrayList<>();

    static {
        createCustomers();
    }

    private LocalDB() {
    }

    private static void createCustomers() {
        Customer customer1 = new Customer(1L, "Ahmet",
                "", "Cakil", 0.00, true);
        Customer customer2 = new Customer(2L, "Mehmet",
                "", "Cakil", 0.00, true);
        Customer customer3 = new Customer(3L, "Ayse",
                "", "Cakil", 0.00, true);
        CUSTOMERS.add(customer1);
        CUSTOMERS.add(customer2);
        CUSTOMERS.add(customer3);
    }

    public static Collection<Customer> getAllCustomers() {
        return CUSTOMERS;
    }

    public static void addCustomer(Customer customer) {
        CUSTOMERS.add(customer);
    }

    public static void update(Customer customer) {
        boolean isChangedCustomer = false;
        for (Customer c : CUSTOMERS) {
            if (Objects.nonNull(customer) &&
                    Objects.nonNull(customer.getId()) &&
                    customer.getId().equals(c.getId())) {
                c.setBalance(customer.getBalance());
                c.setFirstName(customer.getFirstName());
                c.setMiddleName(customer.getMiddleName());
                c.setLastName(customer.getLastName());
                c.setActive(customer.isActive());
                isChangedCustomer = true;
            }
        }
        if (!isChangedCustomer) {
            log.warn("Customer not found");
        }

    }

    public static void delete(Long id) {
        boolean isDeleted = false;
        Iterator<Customer> iterator = CUSTOMERS.iterator();
        while (iterator.hasNext()) {
            Customer customer = iterator.next();
            if (customer.getId().equals(id)) {
                iterator.remove();
                log.warn("Customer is deleted");
                isDeleted = true;
            }
        }
        if (!isDeleted) {
            log.warn("Customer not found with ID = {}", id);
        }
    }
}
