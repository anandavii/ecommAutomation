package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utility.BaseClass;
import java.util.List;

public class UserAccountPage {

    // Locators for User Account Page

    //Continue button post user registration
    @FindBy(xpath = "//a[text()='Continue']")
    private WebElement afterRegistration_Continue_Button ;

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

    @FindBy(xpath = "(//a[contains(@href,'/download')])[2]")
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

    @FindBy(xpath = "//div[@class='list-group']//a[text()='Logout']")
    public WebElement logout_Button;

    //Initialize webelements
    public UserAccountPage() {
        PageFactory.initElements(BaseClass.getDriver(), this);
    }

    // Verify labels on My Account page
    public boolean verifyMyAccountLabels(List<String> expectedLabels) {
        return BaseClass.verifyLabelsPresent(List.of(myAccount_Label, myOrders_Label, myAffiliateAccount_Label, newsletter_Label), expectedLabels);
    }

    // Verify the links under the My Account page
    public boolean verifyMyAccountLink(String expectedText) {
        List<WebElement> myAccountLinks = List.of(editAccount_Link, changePassword_Link, modifyAddress_Link, modifyWishlist_Link);
        for (WebElement link : myAccountLinks) {
            if (BaseClass.verifyText(link, expectedText)) {
                return true;
            }
        }
        return false;
    }

    // Verify the links under the My Orders label
    public boolean verifyMyOrdersLink(String expectedText) {
        List<WebElement> myAccountLinks = List.of(viewOrderHistory_Link, downloads_Link, yourRewardPoints_Link, yourReturnRequests_Link, yourTransactions_Link, recurringPayments_Link);
        for (WebElement link : myAccountLinks) {
            if (BaseClass.verifyText(link, expectedText)) {
                return true;
            }
        }
        return false;
    }

    // Verify the links under the My Affiliate label
    public boolean verifyMyAffiliateLink(String expectedText) {
        List<WebElement> myAccountLinks = List.of(registerForAnAffiliateAccount_Link);
        for (WebElement link : myAccountLinks) {
            if (BaseClass.verifyText(link, expectedText)) {
                return true;
            }
        }
        return false;
    }

    // Verify the links under the Newsletter label
    public boolean verifyNewsletterLink(String expectedText) {
        List<WebElement> myAccountLinks = List.of(subscribeToNewsletter_Link);
        for (WebElement link : myAccountLinks) {
            if (BaseClass.verifyText(link, expectedText)) {
                return true;
            }
        }
        return false;
    }

}
