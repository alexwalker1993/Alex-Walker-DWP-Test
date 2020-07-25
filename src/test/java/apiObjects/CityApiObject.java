package apiObjects;

import io.restassured.response.Response;

import static org.junit.Assert.assertTrue;

public class CityApiObject extends ParentApiObject {
    private Response response;

    public void sendCityGetRequest(String city) {
        response = getRequest("/city/" + city + "/users");
    }

    public void verifyFirstRecordReturned(String id) {
        String responseBody = response.asString();
        assertTrue(responseBody.contains("\"id\": " + id));
        assertTrue(responseBody.contains("\"first_name\": \"Mechelle\""));
        assertTrue(responseBody.contains("\"last_name\": \"Boam\""));
    }

    public void verifyCityStatusCode(int statusCode) {
        verifyGetResponseStatusCode(statusCode, response);
    }

    public void verifyCityBodyIsEmpty() {
        verifyGetResponseBodyIsEmpty(response);
    }
}
