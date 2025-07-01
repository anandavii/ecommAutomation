package utility;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class Hooks extends BaseClass {
        @Before
        public void setup() throws MalformedURLException {
            ChromeOptions options = new ChromeOptions();
            options.addArguments("start-maximized", "disable-infobars","--headless", "--disable-gpu");


            String useGrid = System.getProperty("useGrid", "false");

            WebDriver driver;
            if (useGrid.equalsIgnoreCase("true")) {
                String hubUrl = "http://172.191.151.65:4444";
                driver = new RemoteWebDriver(new URL(hubUrl), options);
            } else {
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver(options);
            }

            BaseClass.setDriver(driver);
            driver.get("https://awesomeqa.com/ui/");
        }

        @After
        public void teardown() {
            BaseClass.quitDriver();
        }
    }
