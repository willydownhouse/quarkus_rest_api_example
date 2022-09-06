package dev.willydownhouse.customer;

import io.quarkus.test.junit.QuarkusTest;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.equalTo;

@QuarkusTest
public class CustomerResourceTest {

    @Test
    public void postFailNoFirstNameResponse() {

        Customer customer = new Customer();
        customer.setFirstName(("pena"));

        given().contentType(ContentType.JSON).body(customer).when().post("/api/customers").then().statusCode(400);
    }

    @Test
    public void testGetCustomers() {
        given()
                .when().get("/api/customers")
                .then()
                .statusCode(200)
                .body(is("[]"));
    }

}