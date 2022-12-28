package org.BDD;

import io.restassured.RestAssured;
import org.testng.annotations.Test;

public class PutBDD {
    @Test
    public void Update(){
        RestAssured.given()
                .baseUri("https://reqres.in/")
                .header("Content-Type","application/json")
                .body("{\n" +
                        "    \"name\": \"Badshah\",\n" +
                        "    \"job\": \"SDET\"\n" +
                        "}")
                .when()
                .put("api/users/2")
                .prettyPrint();
    }
}
