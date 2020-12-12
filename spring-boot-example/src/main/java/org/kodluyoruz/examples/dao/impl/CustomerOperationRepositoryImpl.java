package org.kodluyoruz.examples.dao.impl;

import lombok.extern.slf4j.Slf4j;
import org.kodluyoruz.examples.dao.CustomerOperationRepository;
import org.kodluyoruz.examples.db.LocalDB;
import org.kodluyoruz.examples.model.dao.Customer;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.Random;


@Slf4j
@Repository
public class CustomerOperationRepositoryImpl implements CustomerOperationRepository {

    @Override
    public Customer save(Customer customer) {
        LocalDB.addCustomer(customer);
        log.info("Customer is saved to the DB");
        return customer;
    }

    @Override
    public Customer update(Customer customer) {
        LocalDB.update(customer);
        return customer;
    }

    @Override
    public void delete(Long id) {
        LocalDB.delete(id);
    }

    @Override
    public Collection<Customer> findAllActiveCustomers() {

        /**
         * SELECT * FROM CUSTOMERS WHERE IS_ACTIVE = TRUE;
         */

        return LocalDB.getAllCustomers();
    }
}


