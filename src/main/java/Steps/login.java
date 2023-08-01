package Steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class login {
    @Given("user is on login page")
    public void userIsOnLoginPage() {
    }

    @When("user enters valid username and password")
    public void userEntersValidUsernameAndPassword() {
    }

    @And("clicks on login button")
    public void clicksOnLoginButton() {
    }

    @Then("user is navigated to the home page")
    public void userIsNavigatedToTheHomePage() {
    }

    @When("user enters invalid username and password")
    public void userEntersInvalidUsernameAndPassword() {
    }

    @Then("error message is displayed - Invalid Credentials")
    public void errorMessageIsDisplayedInvalidCredentials() {
    }
}
