package org.acme.quickstart;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;
import org.acme.quickstart.GreetingResource;

@QuarkusTest
public class GreetingResourceTest {
    GreetingResource greetingResource = new GreetingResource();

    @Test
    public void testHelloEndpoint() {
        given()
          .when().get("/randomname")
          .then()
             .statusCode(200);
             
    }

}