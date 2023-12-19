package com.isp.platform.sb.tests;

import com.isp.platform.sb.request.LoginRequest;
import com.isp.platform.sb.response.LoginResponse;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class LoginIT {

    @Test
    @Tag("login")
    public void loginTest() {
        final LoginRequest loginReq = new LoginRequest("","","","wrong_password","some_user");


        LoginResponse response = RestAssured.given().contentType(ContentType.JSON).body(loginReq)
                .header("content-type", "application/json")
                .header("origin", "https://SOME_URL/")
                .header("sec-fetch-site", "same-origin")
                .header("sec-fetch-mode", "cors")
                .header("sec-fetch-dest", "empty")
                .header("referer", "https://SOME_URL/")
                .header("accept-language", "en-US,en;q=0.9,th;q=0.8")
                .expect().statusCode(200).when().post("https://SOME_URL/api/v1-preview/auth/session").as(LoginResponse.class);

        System.out.println(response.getToken());
    }
}
