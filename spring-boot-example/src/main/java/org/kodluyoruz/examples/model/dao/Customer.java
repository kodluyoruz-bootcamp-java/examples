package org.kodluyoruz.examples.model.dao;

import com.fasterxml.jackson.annotation.JsonManagedReference;
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

    @JsonManagedReference
    @OneToMany(mappedBy = "customer", cascade = {CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REMOVE}, orphanRemoval = true)
    private Collection<CustomerAddress> customerAddresses;

}
