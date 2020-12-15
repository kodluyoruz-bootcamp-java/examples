package org.kodluyoruz.examples.service.impl;

import org.kodluyoruz.examples.model.dao.Customer;
import org.kodluyoruz.examples.model.dao.CustomerAddress;
import org.kodluyoruz.examples.model.request.CustomerDto;
import org.kodluyoruz.examples.service.CustomerConverterService;
import org.springframework.stereotype.Service;

import java.util.Collections;

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
        customer.setActive(customerDto.isActive());
        customer.setBalance(customerDto.getBalance());
        customer.setFirstName(customerDto.getFirstName());
        customer.setLastName(customerDto.getLastName());
        customer.setMiddleName(customerDto.getMiddleName());

        CustomerAddress customerAddress = new CustomerAddress();
        customerAddress.setCustomer(customer);
        customerAddress.setCountry("Turkey");
        customerAddress.setCity("Ankara");
        customerAddress.setZipCode(060101L);
        customerAddress.setAddress("TBMM");

        customer.setCustomerAddresses(Collections.singletonList(customerAddress));


        return customer;
    }
}
