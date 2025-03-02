package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utility.BaseClass;

public class UserAccountPage {
    // Locators for User Account Page

    //My Account Label and links
    @FindBy(xpath = "//h2[text()='My Account']")
    public WebElement myAccount_Label;

    @FindBy(xpath = "//a[text()='Edit your account information']")
    public WebElement editAccount_Link;

    @FindBy(xpath = "//a[text()='Change your password']")
    public WebElement changePassword_Link;

    @FindBy(xpath = "//a[text()='Modify your address book entries']")
    public WebElement modifyAddress_Link;

    @FindBy(xpath = "//a[text()='Modify your wish list']")
    public WebElement modifyWishlist_Link;

    //My Orders Label and links
    @FindBy(xpath = "//h2[text()='My Orders']")
    public WebElement myOrders_Label;

    @FindBy(xpath = "//a[text()='View your order history']")
    public WebElement viewOrderHistory_Link;

    @FindBy(xpath = "//a[text()='Downloads']")
    public WebElement downloads_Link;

    @FindBy(xpath = "//a[text()='Your Reward Points']")
    public WebElement yourRewardPoints_Link;

    @FindBy(xpath = "//a[text()='View your return requests']")
    public WebElement yourReturnRequests_Link;

    @FindBy(xpath = "//a[text()='Your Transactions']")
    public WebElement yourTransactions_Link;

    @FindBy(xpath = "//a[text()='Recurring payments']")
    public WebElement  recurringPayments_Link;

    // My affiliate account label and link
    @FindBy(xpath = "//h2[text()='My Affiliate Account']")
    public WebElement myAffiliateAccount_Label;

    @FindBy(xpath = "//a[text()='Register for an affiliate account']")
    public WebElement registerForAnAffiliateAccount_Link;

    // Newsletter label and link
    @FindBy(xpath = "//h2[text()='Newsletter']")
    public WebElement newsletter_Label;

    @FindBy(xpath = "//a[text()='Subscribe / unsubscribe to newsletter']")
    public WebElement subscribeToNewsletter_Link;

    //Initialize webelements
    public UserAccountPage() {
        PageFactory.initElements(BaseClass.getDriver(), this);
    }
}
