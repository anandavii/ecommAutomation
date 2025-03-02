package utility;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Hooks extends BrowserDriver {
        @Before
        public void setup() {
            WebDriverManager.chromedriver().setup();

            ChromeOptions options = new ChromeOptions();
            options.addArguments("start-maximized");
            options.addArguments("disable-infobars");

            driver = new ChromeDriver(options);
            driver.get("https://awesomeqa.com/ui/");
        }

        @After
        public void teardown() {
            if (driver != null) {
                driver.quit();
            }
        }
    }
