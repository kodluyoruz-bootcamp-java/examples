package org.kodluyoruz.examples.service.impl;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.kodluyoruz.examples.dao.CustomerOperationRepository;
import org.kodluyoruz.examples.model.dao.Customer;
import org.kodluyoruz.examples.model.request.CustomerDto;
import org.kodluyoruz.examples.service.CustomerConverterService;
import org.kodluyoruz.examples.service.CustomerOperationService;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Random;

@Slf4j
@Service
@RequiredArgsConstructor
public class CustomerOperationServiceImpl implements CustomerOperationService {


    private final CustomerOperationRepository customerOperationRepository;
    private final CustomerConverterService customerConverterService;


    @Override
    public Customer create(CustomerDto customerDto) {
        // Customer check identity.
        // customer check balance.
        log.info("Created a new customer to save the DB");
        Customer customer = customerConverterService.toCustomer(customerDto);
        customer.setId(new Random(1).nextLong());
        return customerOperationRepository.save(customer);
    }

    @Override
    public Customer update(CustomerDto customerDto) {
        Customer customer = customerConverterService.toCustomer(customerDto);
        return customerOperationRepository.update(customer);
    }

    @Override
    public void delete(Long id) {
        customerOperationRepository.delete(id);
    }

    @Override
    public Collection<Customer> getAllActiveCustomers() {
        Collection<Customer> allActiveCustomers = customerOperationRepository.
                findAllActiveCustomers();
        if (allActiveCustomers.isEmpty()) {
            throw new RuntimeException("Customers not found");
        }
        return allActiveCustomers;
    }
}
