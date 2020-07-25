package apiObjects;

import io.restassured.response.Response;

import static org.junit.Assert.assertTrue;

public class UserByIdApiObject extends ParentApiObject {

    private Response response;
    private String responseBody;

    public void sendGetUserByIdRequest(String id) {
        response = getRequest("/user/" + id);
        responseBody = response.asString();
    }

    public void verifyGetUserByIdStatusCode(int statusCode) {
        verifyGetResponseStatusCode(statusCode, response);
    }

    public void verifyUserId(String userId) {
        assertTrue(responseBody.contains("\"id\": " + userId));
    }

    public void verifyUser(String firstName, String lastName) {
        assertTrue(responseBody.contains("\"id\": 265"));
        assertTrue(responseBody.contains("\"first_name\": \"" + firstName + "\""));
        assertTrue(responseBody.contains("\"last_name\": \"" + lastName + "\""));
    }
}
