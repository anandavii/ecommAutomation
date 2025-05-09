package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utility.BaseClass;
import java.util.List;

public class AddToCartPage {
    // Locators for search functionality
    @FindBy(xpath = "//input[@name='search']")
    private WebElement searchInput;

    @FindBy(xpath = "//button[@class='btn btn-default btn-lg']")
    private WebElement searchButton;

    // Locators for product selection and cart
    @FindBy(xpath = "//a[text()='MacBook Air']")
    private WebElement macbookAirProduct;

    @FindBy(xpath = "//button[contains(text(),'Add to Cart')]")
    private WebElement addToCartButton;

    @FindBy(xpath = "//div[contains(@class,'alert-success')]")
    private WebElement successMessage;

    // Locators for cart functionality
    @FindBy(xpath = "//div[@id='cart']")
    private WebElement cartButton;

    @FindBy(xpath = "//strong[text()='View Cart']")
    private WebElement viewCartLink;

    // Locators for cart verification
    @FindBy(xpath = "//div[@class='table-responsive']//tbody//td[2]")
    private WebElement productNameInCart;

    @FindBy(xpath = "//div[@class='table-responsive']//tbody//td[3]")
    private WebElement modelInCart;

    @FindBy(xpath = "//div[@class='table-responsive']//tbody//td[4]//input")
    private WebElement quantityInCart;

    @FindBy(xpath = "//div[@class='table-responsive']//tbody//td[5]")
    private WebElement priceInCart;

    // Locators for account and logout
    @FindBy(xpath = "//span[text()='My Account']")
    private WebElement myAccountIcon;

    @FindBy(xpath = "//a[text()='Logout']")
    private WebElement logoutLink;

    // Initialize the elements
    public AddToCartPage() {
        PageFactory.initElements(BaseClass.getDriver(), this);
    }

    // Search for a product
    public void searchForProduct(String productName) {
        searchInput.clear();
        searchInput.sendKeys(productName);
        searchButton.click();
    }

    // Select MacBook Air product
    public void selectMacBookAir() {
        macbookAirProduct.click();
    }

    // Add product to cart
    public void addProductToCart() {
        addToCartButton.click();
    }

    // Verify success message
    public boolean verifySuccessMessage(String expectedMessage) {
        return successMessage.getText().contains(expectedMessage);
    }

    // Click on cart button
    public void clickCartButton() {
        cartButton.click();
    }

    // Click on view cart link
    public void clickViewCart() {
        viewCartLink.click();
    }

    // Verify product details in cart
    public boolean verifyProductDetailsInCart(String expectedName, String expectedModel, String expectedQuantity, String expectedPrice) {
        boolean nameMatch = productNameInCart.getText().equals(expectedName);
        boolean modelMatch = modelInCart.getText().equals(expectedModel);
        boolean quantityMatch = quantityInCart.getAttribute("value").equals(expectedQuantity);
        boolean priceMatch = priceInCart.getText().equals(expectedPrice);

        return nameMatch && modelMatch && quantityMatch && priceMatch;
    }

    // Click on My Account icon
    public void clickMyAccount() {
        myAccountIcon.click();
    }

    // Click on Logout
    public void clickLogout() {
        logoutLink.click();
    }
}
