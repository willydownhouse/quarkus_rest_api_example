package dev.willydownhouse.customer;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class CustomerService {

    public String greetCustomer(String name) {
        return "Hello " + name + "!";
    }

}
