package org.BDD;

import io.restassured.RestAssured;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SerializationUsingMap {
    @Test
    public void serial(){
        Map<String,Object> jsonfile = new HashMap<String, Object>();
        List<String> str = new ArrayList<>();
        str.add("java");
        str.add("testng");
        jsonfile.put("name","Badshah");
        jsonfile.put("job","PSE");
        jsonfile.put("skills",str);
        RestAssured.given()
                .baseUri("http://localhost:3000")
                .header("Content-Type","application/json")
                .body(jsonfile)
                .log()
                .all()
                .when()
                .post("/posts")
                .then()
                .log()
                .all();
    }
}
