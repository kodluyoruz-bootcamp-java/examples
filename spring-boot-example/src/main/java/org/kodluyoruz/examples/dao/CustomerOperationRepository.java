package org.kodluyoruz.examples.dao;

import org.kodluyoruz.examples.model.dao.Customer;

import java.util.Collection;

public interface CustomerOperationRepository {

    Collection<Customer> findAllActiveCustomers();

    Customer save(Customer customer);

    Customer update(Customer customer);

    void delete(Long id);
}
