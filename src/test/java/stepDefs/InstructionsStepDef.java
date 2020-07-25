package stepDefs;

import apiObjects.InstructionsApiObject;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class InstructionsStepDef {


    private final InstructionsApiObject instructionsApiObject = new InstructionsApiObject();

    @Given("I set GET instructions api endpoint")
    public void iSetGetInstructionsApiEndpoint() {
        instructionsApiObject.getUrl();
    }

    @When("^I send a GET instructions HTTP request$")
    public void iSendAGetInstructionsHttpRequest() {
        instructionsApiObject.sendInstructionsGetRequest();
    }

    @And("^I should receive my instructions$")
    public void iShouldReceiveMyInstructions() {
        instructionsApiObject.verifyInstructionsResponseBody();
    }

    @Then("^I should receive a status of (.*) from the instructions endpoint$")
    public void iShouldReceiveAStatusOfFromTheInstructionsEndpoint(int statusCode) {
        instructionsApiObject.verifyInstructionsStatusCode(statusCode);
    }
}
