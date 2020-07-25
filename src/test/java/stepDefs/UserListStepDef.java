package stepDefs;

import apiObjects.UserListApiObject;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UserListStepDef {

    private final UserListApiObject userListApiObject = new UserListApiObject();

    @Given("^I set GET user api endpoint$")
    public void iSetGetUserApiEndpoint() {
        userListApiObject.getUrl();
    }

    @When("^I send a GET user list HTTP request$")
    public void iSendAGetUserListHttpRequest() {
        userListApiObject.sendUserListGetRequest();
    }

    @Then("^I should receive a status of (.*) from the user list endpoint$")
    public void iShouldReceiveAStatusOfFromTheUserListEndpoint(int statusCode) {
        userListApiObject.verifyUserListStatusCode(statusCode);
    }

    @Then("^The first user record returned should be (.*)$")
    public void theFirstUserRecordReturnedShouldBe(String firstName) {
        userListApiObject.verifyUserListStatusCode(200);
        userListApiObject.verifyFirstRecordReturned(firstName);
    }
}
