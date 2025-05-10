package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utility.BaseClass;

import java.util.List;

public class LoginPage extends BaseClass {
    //Locators for login Page
    @FindBy(xpath = "//a[text()='Login']")
    private WebElement Login_Link;

    @FindBy(xpath = "//h2[text()='Returning Customer']")
    private WebElement returningCustomer_Label;

    @FindBy(xpath = "//input[@id='input-email']")
    private WebElement email_Input;

    @FindBy(xpath = "//input[@id='input-password']")
    private WebElement password_Input;

    @FindBy(xpath = "(//a[text()='Forgotten Password'])[1]")
    private WebElement forgottenPassword_Link;

    @FindBy(xpath = "//input[@value='Login']")
    private WebElement login_Button;

    //My Account Label and links
    @FindBy(xpath = "//h2[text()='My Account']")
    public WebElement myAccount_Label;

    //Initialize the elements
    public LoginPage() {
        PageFactory.initElements(BaseClass.getDriver(), this);
    }

    //check title of my Account homepage
    public boolean isOnLoginpageByTitle() {
        BaseClass.waitForElementToBeVisible(myAccount_Label,10);
        return BaseClass.isPageTitle("My Account");
    }

    //click on Login link
    public void clickOnLogin() {
        Login_Link.click();
    }

    //Verify user is on the login page
    public boolean isOnLoginPage() {
        return BaseClass.isDisplayed((returningCustomer_Label));
    }

    // Enter login credentials
    public void enterLoginDetails(String email, String password) {
        email_Input.sendKeys(email);
        password_Input.sendKeys(password);
    }

    // Click Login button
    public void clickOnLoginButton() {
        login_Button.click();
    }

    //check title of MyAccount homepage
    public boolean isOnMyAccounHomepagetByTitle() {
        return BaseClass.isPageTitle("My Account");
    }

}
