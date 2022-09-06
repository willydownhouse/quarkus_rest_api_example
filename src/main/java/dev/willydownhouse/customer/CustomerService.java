package dev.willydownhouse.customer;

import java.util.List;
import java.util.Optional;

import java.util.stream.Collectors;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.transaction.Transactional;
import javax.validation.Valid;

import dev.willydownhouse.exceptions.ServiceException;
import lombok.AllArgsConstructor;
import lombok.NonNull;
import lombok.extern.slf4j.Slf4j;

@ApplicationScoped
@AllArgsConstructor
@Slf4j
public class CustomerService {

    @Inject
    CustomerRepository customerRepository;

    public List<Customer> getAllCustomers() {
        return customerRepository.listAll();
    }

    public Customer addCustomer(@Valid Customer customer) {
        customerRepository.persist(customer);
        return customer;
    }

}
