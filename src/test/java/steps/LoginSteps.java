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
import pages.LoginPage;

public class LoginSteps extends BaseTest {

    LoginPage loginPage;

    @Before(value = {"@TC002"})
    public void setUp(Scenario scenario) {
        init(scenario, 10);
        loginPage = new LoginPage(action);
    }

    @After(value = {"@TC002"})
    public void tearDown(Scenario scenario) {
        terminate(scenario);
    }

    @Given("^I navigate to last\\.fm login page$")
    public void i_navigate_to_last_fm_login_page() {
        action.openWebSiteByUrl(Config.loginUrl);
        loginPage.rejectAdds();
    }

    @When("^I set email$")
    public void i_set_email() {
        loginPage.setEmail("ank7@op.pl");
    }

    @Then("^I set invalid password$")
    public void i_set_password() {
        loginPage.setPassword("qwertyuiop1#");
    }

    @Then("^I click submit button$")
    public void i_click_submit_button() {
        loginPage.submitLoginForm();
    }

    @Then("^I should see alert displayed$")
    public void i_should_see_alert_displayed() {
        Assert.assertTrue(loginPage.isAlertDisplayed());
    }
}
