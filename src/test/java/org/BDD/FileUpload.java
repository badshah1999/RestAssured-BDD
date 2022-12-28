package org.BDD;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import java.io.File;

public class FileUpload {
    @Test
    public void Upload(){
        File file = new File("/Users/badshah.p/Desktop/tree-736885__480.jpeg");
        RestAssured.given()
                .multiPart("file",file,"multipart/form-data")
                .when()
                .post("https://cgi-lib.berkeley.edu/ex/fup.html")
                .then()
                .statusCode(200)
                .log().all();

        //System.out.println(response.prettyPrint());
    }
}
