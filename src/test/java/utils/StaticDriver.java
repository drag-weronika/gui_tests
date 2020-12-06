package utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class StaticDriver {

    private static WebDriver driver;

    private StaticDriver() {
    }

    public static WebDriver getInstanceWebDriver() {
        if (driver == null) {
            WebDriverManager.chromedriver().setup();
            ChromeOptions chrome = new ChromeOptions();
            chrome.addArguments("--window-size-1920,1080").addArguments("--disable-notifications");
            driver = new ChromeDriver(chrome);
        }
        return driver;
    }

}
