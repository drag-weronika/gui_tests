package base;

import cucumber.api.Scenario;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import utils.ActionsUtils;
import utils.StaticDriver;

public class BaseTest {

    protected static Logger logger;
    protected WebDriver driver;
    protected WebDriverWait wait;
    protected ActionsUtils action;

    protected void init(Scenario scenario, int timeoutInSeconds) {
        logger = LoggerFactory.getLogger(this.getClass());
        logger.info("Setup scnario: " + scenario.getName());
        driver = StaticDriver.getInstanceWebDriver();
        wait = new WebDriverWait(driver, timeoutInSeconds);
        action = new ActionsUtils(scenario, driver, wait);
    }

    protected void terminate(Scenario scenario) {
        if (scenario.isFailed()) {
            action.scenarioFailed();
        }
        logger.info("Tear down scenario: " + scenario.getName());

    }
}
