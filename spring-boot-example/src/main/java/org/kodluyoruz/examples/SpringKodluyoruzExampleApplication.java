package org.kodluyoruz.examples;


import lombok.extern.slf4j.Slf4j;
import org.kodluyoruz.examples.controller.CustomerController;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
@Slf4j
public class SpringKodluyoruzExampleApplication implements CommandLineRunner {

    private final CustomerController customerController;

    public SpringKodluyoruzExampleApplication(CustomerController customerController) {
        this.customerController = customerController;
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringKodluyoruzExampleApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        log.info("Customer Primary Key is {}", customerController.createCustomer());

    }
}
