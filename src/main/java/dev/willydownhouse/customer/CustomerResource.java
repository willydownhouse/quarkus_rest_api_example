package dev.willydownhouse.customer;

import java.util.List;

import javax.inject.Inject;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.ws.rs.*;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;
import java.net.URI;
import java.util.Objects;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Path("/api/customers")
public class CustomerResource {

    @Inject
    CustomerService customerService;

    @GET
    @Path("/hello")
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return "ciao wille";
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Customer> list() {
        System.out.println("GET ALL ");
        return customerService.getAllCustomers();
    }

    @POST
    public Customer add(Customer customer) {
        return customerService.addCustomer(customer);
    }

}