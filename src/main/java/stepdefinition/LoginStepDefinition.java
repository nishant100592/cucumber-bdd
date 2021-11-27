package stepdefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefinition {


    @Given("User on login page")
    public void user_on_login_page() {
        System.out.println("User on login page");
    }

    @When("User enters valid username")
    public void user_enters_valid_username() {
        System.out.println("User enters valid username");
    }

    @When("User enters valid password")
    public void user_enters_valid_password() {
        System.out.println("User enters valid password");
    }

    @When("User clicks on Login button")
    public void user_clicks_on_login_button() {
        System.out.println("User clicks on Login button");
    }

    @Then("User on homepage")
    public void user_on_homepage() {
        System.out.println("User on homepage");
    }

}
