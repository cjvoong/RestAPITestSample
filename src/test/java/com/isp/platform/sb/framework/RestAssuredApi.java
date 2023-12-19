package com.isp.platform.sb.framework;

import com.isp.platform.sb.utils.Constants;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;

import java.util.Map;

public class RestAssuredApi {
    private RequestSpecBuilder builder = new RequestSpecBuilder();
    RequestSpecification requestSpec;
    RequestSpecification request;

    public RestAssuredApi() {
        builder.setBaseUri(Constants.ApiConstants.URL);
        builder.setBasePath(Constants.ApiConstants.PATH);
    }

    private Response ExecuteGetRequest() {
        requestSpec = builder.build();
        request = RestAssured.given().spec(requestSpec);
        return request.get();
    }

    public Response ExecuteWithQueryParams(Map<String, String> queryParams) {
        builder.addQueryParams(queryParams);
        return ExecuteGetRequest();
    }
}
