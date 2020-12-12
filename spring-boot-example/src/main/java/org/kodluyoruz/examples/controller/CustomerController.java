package org.kodluyoruz.examples.controller;

import org.kodluyoruz.examples.service.CustomerOperationService;
import org.springframework.stereotype.Controller;

@Controller
public class CustomerController {

    private final CustomerOperationService customerOperationService;

    public CustomerController(CustomerOperationService customerOperationService) {
        this.customerOperationService = customerOperationService;
    }

    public Long createCustomer() {
        return customerOperationService.create();
    }
}
