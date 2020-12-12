package org.kodluyoruz.examples.model.dao;

import lombok.*;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class Customer {

    /**
     * get{FieldName} - camelCase
     * set{FieldName}
     */

    private Long id; // getId() - setId(Long id)
    private String firstName; // getFirstName()
    private String middleName; // getMiddleName();
    private String lastName;
    private Double balance;
    private boolean isActive;

}
