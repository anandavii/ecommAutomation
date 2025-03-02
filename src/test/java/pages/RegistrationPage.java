package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utility.BrowserDriver;
import java.util.UUID;

public class RegistrationPage extends BrowserDriver {
// Locators for the Register Page
    @FindBy(xpath = "//span[text()='My Account']")
    private WebElement myAccount_Icon;

    @FindBy(xpath = "//a[text()='Register']")
    private WebElement register_Link;

    @FindBy(xpath = "//h1[text()='Register Account']")
    private WebElement registerAccount_Label;

    @FindBy(xpath = "//input[@id='input-firstname']")
    private WebElement firstName_Input;

    @FindBy(xpath = "//input[@id='input-lastname']")
    private WebElement lastName_Input;

    @FindBy(xpath = "//input[@id='input-email']")
    private WebElement email_Input;

    @FindBy(xpath = "//input[@id='input-telephone']")
    private WebElement telephone_Input;

    @FindBy(xpath = "//input[@id='input-password']")
    private WebElement password_Input;

    @FindBy(xpath = "//input[@id='input-confirm']")
    private WebElement confirmPassword_Input;

    @FindBy(xpath = "//input[@name='agree']")
    private WebElement iAgree_CheckBox;

    @FindBy(xpath = "//input[@value='Continue']")
    private WebElement continue_Button;

    @FindBy(xpath = "//h1[text()='Your Account Has Been Created!']")
    private WebElement successMessage;

    //Initialize the elements
    public RegistrationPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    //Click on myAccountIcon
    public void clickOnMyAccount() {
        BrowserDriver.waitForElementToBeClickable(myAccount_Icon,10);
        myAccount_Icon.click();
    }

    //click on Register link
    public void clickOnRegister() {
        register_Link.click();
    }

    //Verify user is on the registration page
    public boolean isOnRegisterPage() {
        return registerAccount_Label.isDisplayed();
    }

    // Generate random email
    private String generateRandomEmail() {
        String uniqueEmail = "test" + UUID.randomUUID().toString() + "@myemail.com";
        System.out.println(uniqueEmail);
        return uniqueEmail;
    }
    public void enterRegisterationDetails(io.cucumber.datatable.DataTable table) {
        String randomEmail = generateRandomEmail();
        firstName_Input.sendKeys(table.cell(0,1));
        lastName_Input.sendKeys(table.cell(1,1));
        email_Input.sendKeys(randomEmail);
        telephone_Input.sendKeys(table.cell(2,1));
        password_Input.sendKeys(table.cell(3,1));
        confirmPassword_Input.sendKeys(table.cell(4,1));
    }

    public void clickOniAgree() {
        if (!iAgree_CheckBox.isSelected()) {
            iAgree_CheckBox.click();
        }
    }

    //Click on Continue Button
    public void clickOnContinue() {
        continue_Button.click();
    }

    //verify successful registration message
    public boolean isRegisteratioSuccessful() {
        return successMessage.isDisplayed();
    }
}
