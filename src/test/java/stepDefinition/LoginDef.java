package stepDefinition;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPage;

import static org.junit.Assert.assertTrue;

public class LoginDef {
    private final LoginPage loginPage = new LoginPage();

    @When("User clicks on the Login option")
    public void user_clicks_on_the_login_option() {
        loginPage.clickOnLogin();
    }
    @Then("User should be navigated to the Login page")
    public void user_should_be_navigated_to_the_login_page() {
        assertTrue("User is not on the login page", loginPage.isOnLoginPage());
    }
    @When("User enters email {string} and password {string}")
    public void user_enters_email_and_password(String email, String password) {
        loginPage.enterLoginDetails(email, password);
    }
    @When("User clicks on the Login button")
    public void user_clicks_on_the_login_button() {
        loginPage.clickOnLoginButton();
    }
    @Then("User should be logged in successfully")
    public void user_should_be_logged_in_successfully() {
        assertTrue("User is not on the login page", loginPage.isOnLoginpageByTitle());
    }
}
