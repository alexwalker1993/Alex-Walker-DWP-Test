package apiObjects;

import io.restassured.response.Response;

import static org.junit.Assert.assertTrue;

public class UserListApiObject extends ParentApiObject {
    private Response response;

    public void sendUserListGetRequest() {
        response = getRequest("/users");
    }

    public void verifyUserListStatusCode(int statusCode) {
        verifyGetResponseStatusCode(statusCode, response);
    }

    public void verifyFirstRecordReturned(String firstName) {
        String responseBody = response.asString();
        assertTrue(responseBody.contains("\"id\": 1"));
        assertTrue(responseBody.contains("\"first_name\": \"" + firstName + "\""));
        assertTrue(responseBody.contains("\"last_name\": \"Shieldon\""));
    }
}
