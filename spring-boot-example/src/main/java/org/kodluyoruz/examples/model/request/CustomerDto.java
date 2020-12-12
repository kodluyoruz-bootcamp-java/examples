package org.kodluyoruz.examples.model.request;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CreateCustomerRequest {

    private String firstName;
    private String middleName;
    private String lastName;
    private Double balance;
}
