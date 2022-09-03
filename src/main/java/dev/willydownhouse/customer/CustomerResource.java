package dev.willydownhouse.customer;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/api/customers")
public class CustomerResource {

    @Inject
    CustomerService customerService;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return "hello willy";
    }

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    @Path("/{name}")
    public String helloCustomer(String name) {
        return customerService.greetCustomer(name);
    }
}