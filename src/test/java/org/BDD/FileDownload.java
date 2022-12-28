package org.BDD;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class FileDownload {
    @Test
    public void Download() throws IOException {

        Response response = RestAssured
                .given()
                .get("https://reqres.in/api/users?page=2")
                .andReturn();

        byte[] bytes = response.getBody().asByteArray();
        File file = new File("/Users/badshah.p/Desktop/user.json");
        Files.write(file.toPath(),bytes);
    }
}
