# Alex Walker DWP Test

An API test repository for a job application to DWP

## Tech stack

To create this repository I used java 11 and rest assured for the api connections. I have written the tests using a slightly altered version of the Cucumber Page Object Model,
rather than page objects I created API objects.

So my tests have an easy to read business layer written using the gherkin syntax, a step definition layer to translate those cucumber steps
to code and then the api object layer which does all the interaction with the API's. 

I chose to do it this way for readability and maintainability, the feature files can be read by anyone with domain knowledge and all alterations due to changes in functionality are all done the API objects. To take the maintainability just a little bit further I also created a
'parent api object' this api object contains some common functions that each of my api's needed so that if there is a need to change the way that the API's are interacted with
that is also just in one place.


## Running the tests

To run the test either execute the TestRunner class found here: 

Or run ```mvn clean install``` from the command line
