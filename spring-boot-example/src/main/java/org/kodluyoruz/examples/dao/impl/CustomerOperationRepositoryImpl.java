package org.kodluyoruz.examples.dao.impl;

import lombok.extern.slf4j.Slf4j;
import org.kodluyoruz.examples.dao.CustomerOperationRepository;
import org.springframework.stereotype.Repository;

import java.util.Random;


@Slf4j
@Repository
public class CustomerOperationRepositoryImpl implements CustomerOperationRepository {

    @Override
    public Long save() {
        log.info("Customer is saved to the DB");
        return new Random(100).nextLong();
    }
}


