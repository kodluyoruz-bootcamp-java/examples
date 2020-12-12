package org.kodluyoruz.examples.service;

import org.kodluyoruz.examples.model.dao.Customer;
import org.kodluyoruz.examples.model.request.CustomerDto;

import java.util.Collection;

public interface CustomerOperationService {

    Collection<Customer> getAllActiveCustomers();

    Customer create(CustomerDto customerDto);

    Customer update(CustomerDto customerDto);

    void delete(Long id);
}
