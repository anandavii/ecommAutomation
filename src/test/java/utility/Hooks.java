package utility;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Hooks extends BaseClass {
        @Before
        public void setup() {
            WebDriverManager.chromedriver().setup();
            ChromeOptions options = new ChromeOptions();
            options.addArguments("start-maximized");
            options.addArguments("disable-infobars");

            WebDriver driver = new ChromeDriver(options);
            BaseClass.setDriver(driver);
            driver.get("https://awesomeqa.com/ui/");
        }

        @After
        public void teardown() {
            BaseClass.quitDriver();
        }
    }
