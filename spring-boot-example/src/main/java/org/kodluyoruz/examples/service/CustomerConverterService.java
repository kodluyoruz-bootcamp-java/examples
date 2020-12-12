package org.kodluyoruz.examples.service;

import org.kodluyoruz.examples.model.dao.Customer;
import org.kodluyoruz.examples.model.request.CustomerDto;

public interface CustomerConverterService {

    Customer toCustomer(CustomerDto customerDto);
}
