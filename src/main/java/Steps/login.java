package Steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.logging.Logger;

public class login {
    Logger log = Logger.getLogger("Login");
    @Given("user is on login page")
    public void userIsOnLoginPage() {
        log.info("This is my log message");
        System.out.println("User is on login page");

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
