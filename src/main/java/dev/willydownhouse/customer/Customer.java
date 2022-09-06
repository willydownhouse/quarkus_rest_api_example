package dev.willydownhouse.customer;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

import lombok.Data;

@Entity
@Data
@Table(name = "customer")
public class Customer {
    @Id
    @GeneratedValue
    private Integer customerId;

    @NotEmpty
    private String firstName;

    @NotEmpty
    private String lastName;

}
