package org.kodluyoruz.examples.model.dao;

import lombok.*;

import javax.persistence.*;
import java.util.Collection;
import java.util.Date;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
@Entity
public class Customer {

    /**
     * get{FieldName} - camelCase
     * set{FieldName}
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(unique = true)
    private String firstName;
    private String middleName;
    private String lastName;
    private Double balance;
    private boolean isActive;
    @Temporal(TemporalType.DATE)
    private Date cratedDate;

    @OneToMany(mappedBy = "customer")
    private Collection<CustomerAddress> customerAddresses;

}
