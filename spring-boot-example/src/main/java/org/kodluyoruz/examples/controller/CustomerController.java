package org.kodluyoruz.examples.controller;

import lombok.RequiredArgsConstructor;
import org.kodluyoruz.examples.model.dao.Customer;
import org.kodluyoruz.examples.model.request.CustomerDto;
import org.kodluyoruz.examples.service.CustomerOperationService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@Controller
@RequestMapping("customers")
@RequiredArgsConstructor
public class CustomerController {

    /**
     * GET -> Resource'da herhangi bir değişiliklik yok. Body parametreleri almaz.
     * POST -> Respurce 'da güncelleme işi olabildiği gibi herhangi bir operasyon olmayabilir.
     *         - Body Parametresi alabilir
     * PUT -> Yeni bir resource yaratılır.
     *         - Body parametresi alır
     *
     * DELETE -> İlgili resource siler..
     *
     * api.kodluyoruz.org/customers
     */


    /**
     * GET -> getAllActiveCustomers()  api.kodluyoruz.org/customers -> GET
     * CREATE -> create();             api.kodluyoruz.org/customers -> POST
     * UPDATE -> update();             api.kodluyoruz.org/customers -> PUT
     * DELETE -> delete();             api.kodluyoruz.org/customers -> DELETE
     * GET -> getCustomerById          api.kodluyoruz.org/customers/{id} -> GET
     */
    private final CustomerOperationService customerOperationService;


    @GetMapping
    public ResponseEntity<Collection<Customer>> fetchAllActiveCustomers() {
        Collection<Customer> allActiveCustomers = customerOperationService.getAllActiveCustomers();
        return ResponseEntity.ok().body(allActiveCustomers);

    }

    @PostMapping
    public ResponseEntity<Customer> create(@RequestBody CustomerDto customerDto) {
        Customer customer = customerOperationService.create(customerDto);
        return ResponseEntity.ok().body(customer);
    }

    @PutMapping
    public ResponseEntity<Customer> update(@RequestBody CustomerDto customerDto) {
        Customer customer = customerOperationService.update(customerDto);
        return ResponseEntity.ok().body(customer);
    }

    @DeleteMapping("/{customerId}")
    public ResponseEntity<?> delete(@PathVariable("customerId") Long id) {
        customerOperationService.delete(id);
        return ResponseEntity.ok().build();
    }


}
