package stepDefs;

import apiObjects.UserByIdApiObject;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UserByIdStepDef {
    private final UserByIdApiObject userByIdApiObject = new UserByIdApiObject();
    private String userId;

    @Given("^I set GET user by ID api endpoint$")
    public void iSetGetUserByIdApiEndpoint() {
        userByIdApiObject.getUrl();
    }

    @When("^I send a GET user by ID request with (.*)$")
    public void iSendAGetUserByIdRequestWithId(String id) {
        userId = id;
        userByIdApiObject.sendGetUserByIdRequest(id);

    }

    @Then("^I should receive a status of (.*) from the get user by ID endpoint$")
    public void iShouldReceiveAStatusOfFromTheGetUserByIdEndpoint(int statusCode) {
        userByIdApiObject.verifyGetUserByIdStatusCode(statusCode);
    }

    @And("^The response should contain the user id$")
    public void theResponseShouldContainTheUserId() {
        userByIdApiObject.verifyUserId(userId);
    }

    @And("^The user record should be first name \"(.*?)\" and last name \"(.*?)\"$")
    public void theUserRecordShouldBe(String firstName, String lastName) {
        userByIdApiObject.verifyUser(firstName, lastName);
    }
}
