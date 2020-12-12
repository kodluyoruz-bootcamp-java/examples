package org.kodluyoruz.examples.service.impl;

import lombok.extern.slf4j.Slf4j;
import org.kodluyoruz.examples.dao.CustomerOperationRepository;
import org.kodluyoruz.examples.service.CustomerOperationService;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class CustomerOperationServiceImpl implements CustomerOperationService {


    private final CustomerOperationRepository customerOperationRepository;

    public CustomerOperationServiceImpl(CustomerOperationRepository customerOperationRepository) {
        this.customerOperationRepository = customerOperationRepository;
    }

    @Override
    public Long create() {
        // Customer check identity.
        // customer check balance.
        log.info("Created a new customer to save the DB");
        return customerOperationRepository.save();
    }
}
