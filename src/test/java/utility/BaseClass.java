package utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.time.Duration;
import java.util.List;

public class BaseClass {

    private static WebDriver driver;

    // Setter for WebDriver
    public static void setDriver(WebDriver webDriver) {
        if (driver == null) {  // Ensures singleton instance
            driver = webDriver;
        }
    }

    // Getter for WebDriver
    public static WebDriver getDriver() {
        if (driver == null) {
            throw new IllegalStateException("WebDriver is not initialized. Call setDriver() first.");
        }
        return driver;
    }

    // Quit WebDriver instance
    public static void quitDriver() {
        if (driver != null) {
            driver.quit();
            driver = null; // Reset driver after quitting
        }
    }
    // Wait until an element is visible
    public static void waitForElementToBeVisible(WebElement element, int timeoutInSeconds) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeoutInSeconds));
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    // Wait until an element is clickable
    public static void waitForElementToBeClickable(WebElement element, int timeoutInSeconds) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeoutInSeconds));
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    // Method to verify labels visibility on a page
    public static boolean verifyLabelsPresent(List<WebElement> labels, List<String> expectedLabels) {
        for (String expectedLabel : expectedLabels) {
            boolean found = false;
            for (WebElement label : labels) {
                if (label.getText().trim().equals(expectedLabel)) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                System.out.println("Missing label: " + expectedLabel);
                return false;
            }
        }
        return true;
    }

    // Method to verify links presence on a page
    public static boolean verifyLinksPresent(List<WebElement> links, List<String> expectedLinks) {
        for (String expectedLink : expectedLinks) {
            boolean found = links.stream().anyMatch(link -> link.getText().trim().equals(expectedLink));
            if (!found) {
                System.out.println("Missing link: " + expectedLink);
                return false;
            }
        }
        return true;
    }

    // Method to check if an element is displayed on the page
    public static boolean isDisplayed(WebElement element) {
        try {
            return element.isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }

}
