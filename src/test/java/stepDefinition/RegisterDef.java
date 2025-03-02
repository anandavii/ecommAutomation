package stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.RegistrationPage;

import static org.junit.Assert.assertTrue;

public class RegisterDef {

    public RegistrationPage registrationPage = new RegistrationPage();

    //Step1. User navigates to the website
    @Given("User opens application homepage")
    public void user_opens_application_homepage() {
        //registrationPage.clickOnMyAccount();
    }
    @When("User clicks on the MyAccount icon")
    public void user_clicks_on_the_MyAccount_icon() {
        registrationPage.clickOnMyAccount();
    }
    @And("User clicks on the Register option")
    public void user_clicks_on_the_Register_option() {
        registrationPage.clickOnRegister();
    }
    @Then("User should be navigated to the Registration page")
    public void user_should_be_navigated_to_the_registration_page() {
        assertTrue("User is not on Registration page", registrationPage.isOnRegisterPage());
    }
    @When("User enters the following registration details:")
    public void user_enters_the_following_registration_details(io.cucumber.datatable.DataTable table) {
        registrationPage.enterRegisterationDetails(table);
    }
    @When("User accepts the terms and conditions")
    public void user_accepts_the_terms_and_conditions() {
        registrationPage.clickOniAgree();
    }
    @When("User clicks on the Continue button")
    public void user_clicks_on_the_Continue_button() {
        registrationPage.clickOnContinue();
    }
    @Then("User should see the registration successful message")
    public void user_should_see_the_registration_successful_message() {
        assertTrue("Registration success message not displayed", registrationPage.isRegisterationSuccessful());
    }

    @Then("User verified after registration Continue button is displayed")
    public void userVerifiedAfterRegistrationContinueButtonIsDisplayed() {
        assertTrue("Post Registration Continue button is not displayed", registrationPage.isafterRegistration_Continue_ButtonDisplayed());
    }
}

