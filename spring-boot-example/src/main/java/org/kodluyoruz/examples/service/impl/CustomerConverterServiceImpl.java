package org.kodluyoruz.examples.service.impl;

import org.kodluyoruz.examples.model.dao.Customer;
import org.kodluyoruz.examples.model.request.CustomerDto;
import org.kodluyoruz.examples.service.CustomerConverterService;
import org.springframework.stereotype.Service;

@Service
public class CustomerConverterServiceImpl implements CustomerConverterService {

    /**
     * @Override public CustomerDto toCustomerDTO(Customer customer) {
     * CustomerDto customerDto = new CustomerDto();
     * customerDto.setBalance(customer.getBalance());
     * customerDto.setFirstName(customer.getFirstName());
     * customerDto.setLastName(customer.getLastName());
     * customerDto.setMiddleName(customer.getMiddleName());
     * return customerDto;
     * }
     **/

    @Override
    public Customer toCustomer(CustomerDto customerDto) {
        Customer customer = new Customer();
        customer.setId(customerDto.getId());
        customer.setActive(true);
        customer.setBalance(customerDto.getBalance());
        customer.setFirstName(customerDto.getFirstName());
        customer.setLastName(customerDto.getLastName());
        customer.setMiddleName(customerDto.getMiddleName());
        return customer;
    }
}
