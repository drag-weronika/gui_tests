package steps;

import base.BaseTest;
import config.Config;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import pages.RegistrationPage;

public class RegistrationSteps extends BaseTest {

    RegistrationPage registrationPage;

    @Before(value = {"@TC02"})
    public void setUp(Scenario scenario) {
        init(scenario, 10);
        registrationPage = new RegistrationPage(action);
    }

    @After(value = {"@TC02"})
    public void tearDown(Scenario scenario) {
        terminate(scenario);
    }

    @Given("^I navigate to last\\.fm registration page$")
    public void i_navigate_to_last_fm_registration_page() {
        action.openWebSiteByUrl(Config.registrationUrl);
        registrationPage.rejectAdds();
    }

    @When("^I enter email with invalid format$")
    public void i_enter_email_with_invalid_format() {
        registrationPage.setEmail("a@a.c");
    }

    @Then("^I see alert message displayed$")
    public void i_see_alert_message_displayed() {
        Assert.assertTrue(registrationPage.isAlertDisplayed());
    }

}
