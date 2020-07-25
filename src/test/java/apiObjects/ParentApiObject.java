package apiObjects;


import io.restassured.RestAssured;
import io.restassured.response.Response;

import static org.junit.Assert.assertEquals;

public class ParentApiObject {
    String baseURL = "http://bpdts-test-app-v2.herokuapp.com";
    private Response response;

    public void getUrl() {
        RestAssured.baseURI = baseURL;
    }

    public Response getRequest(String requestURL) {
        try {
            response = RestAssured.given()
                    .when()
                    .get(requestURL);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return response;
    }

    public void verifyGetResponseStatusCode(int statusCode, Response response) {
        assertEquals(statusCode, response.getStatusCode());
    }

    public void verifyGetResponseBodyIsEmpty(Response response) {
        String responseBody = response.asString();
        assertEquals("[]\n", responseBody);
    }
}
