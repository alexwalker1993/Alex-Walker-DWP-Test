package apiObjects;

import io.restassured.response.Response;

import static org.junit.Assert.assertTrue;

public class InstructionsApiObject extends ParentApiObject {
    private String responseBody;
    private Response response;

    public void sendInstructionsGetRequest() {
        response = getRequest("/instructions");
    }

    public void verifyInstructionsStatusCode(int statusCode) {
        verifyGetResponseStatusCode(statusCode, response);
    }

    public void verifyInstructionsResponseBody() {
        String responseBody = response.asString();
        assertTrue(responseBody.contains("\"todo\": \"Create a short automated test for this API. Check that the data returned by the API is valid, and that ensure that each valid operation can be successfully called for each endpoint. Once you've built the tests, push the answer to Github or Gitlab, and send us a link. \""));
    }
}
