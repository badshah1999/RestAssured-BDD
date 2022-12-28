package org.BDD;

import io.restassured.RestAssured;
import org.testng.annotations.Test;

public class PostBDD {
    @Test
    public void Create(){
        RestAssured.given()
                .baseUri("https://reqres.in/")
                .header("Content-Type","application/json")
                .body("{\n" +
                        "    \"name\": \"morpheus\",\n" +
                        "    \"job\": \"leader\"\n" +
                        "}\n")
                .when()
                .post("api/users?page=2")
                .prettyPrint();
    }
}
