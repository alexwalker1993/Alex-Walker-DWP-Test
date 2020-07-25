package stepDefs;

import apiObjects.CityApiObject;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CityStepDef {

    private final CityApiObject cityApiObject = new CityApiObject();

    @Given("^I set GET city api endpoint$")
    public void iSetGetCityApiEndpoint() {
        cityApiObject.getUrl();
    }

    @When("^I send a GET city HTTP request with (.*)$")
    public void iSendAGetHttpRequestWithCity(String city) {
        cityApiObject.sendCityGetRequest(city);
    }

    @Then("^The first record returned should be id (.*)$")
    public void theFirstRecordReturnedShouldBeId(String id) {
        cityApiObject.verifyCityStatusCode(200);
        cityApiObject.verifyFirstRecordReturned(id);
    }

    @Then("^I should receive a status of (.*) from the city endpoint$")
    public void iShouldReceiveAStatusOf(int statusCode) {
        cityApiObject.verifyCityStatusCode(statusCode);
    }

    @And("^The response body should be empty$")
    public void theReponseBodyShouldBeEmpty() {
        cityApiObject.verifyCityBodyIsEmpty();
    }
}
