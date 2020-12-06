package utils;

import cucumber.api.Scenario;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.logging.LogEntries;
import org.openqa.selenium.logging.LogEntry;
import org.openqa.selenium.logging.LogType;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.sql.Timestamp;

public class ActionsUtils {

    private Scenario scenario;
    private WebDriver webDriver;
    private WebDriverWait waitDriver;

    public ActionsUtils(Scenario scenario, WebDriver driver, WebDriverWait wait) {
        this.scenario = scenario;
        this.webDriver = driver;
        this.waitDriver = wait;
    }

    public WebDriver getWebDriver() {
        return webDriver;
    }

    public void openWebSiteByUrl(String url) {
        webDriver.get(url);
    }

    public void sendKeys(WebElement element, String text) {
        element.sendKeys(text);
    }

    public boolean isElementDisplayed(WebElement webElement) {
        try {
            if (webElement.isDisplayed()) {
                return true;
            }
        } catch (NoSuchElementException ignored) {
        }
        return false;
    }

    public void scenarioFailed() {
        writeLogsToScenario(getConsoleLogs());
    }

    private void writeLogsToScenario(String logs) {
        scenario.write(logs);
    }

    private String getConsoleLogs() {
        LogEntries logEntries = webDriver.manage().logs().get(LogType.BROWSER);
        StringBuilder str = new StringBuilder();
        str.append("JS console logs <\n");
        for (LogEntry entry : logEntries) {
            Timestamp logTime = new Timestamp(entry.getTimestamp());
            str.append((logTime.toLocalDateTime()));
            str.append(" ");
            str.append("entry.getLevel()");
            str.append(" ");
            str.append("entry.getMessage()");
            str.append("/");
        }
        str.append((" >\n"));
        return str.toString();
    }

}
