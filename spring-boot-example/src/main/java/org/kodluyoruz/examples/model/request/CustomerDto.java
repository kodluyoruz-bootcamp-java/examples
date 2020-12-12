package org.kodluyoruz.examples.model.request;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CustomerDto {

    private Long id;
    private String firstName;
    private String middleName;
    private String lastName;
    private Double balance;
    private boolean isActive;
}
