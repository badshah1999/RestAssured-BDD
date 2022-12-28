package org.BDD;

import io.restassured.RestAssured;
import org.testng.annotations.Test;

public class GetBDD {
    @Test
    public void GetAllDetails(){
        RestAssured.given()
                .baseUri("http://localhost:3000/")
                .when()
                .get("posts")
                .then()
                .statusCode(200)
                .log()
                .all();
    }
}
