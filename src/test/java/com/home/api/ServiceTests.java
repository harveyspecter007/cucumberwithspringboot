package com.home.api;

import org.junit.Test;

import static io.restassured.RestAssured.given;

public class ServiceTests {

    @Test
    public void check200()
    {

        given().when().
                get("https://www.gov.uk")
                .then().
                statusCode(200);

    }


}
