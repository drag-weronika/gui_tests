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

    @Before(value = {"@login"})
    public void setUp(Scenario scenario) {
        init(scenario, 10);
        loginPage = new LoginPage(action);
    }

    @After(value = {"@login"})
    public void tearDown(Scenario scenario) {
        terminate(scenario);
    }

    @Given("^I navigate to login page$")
    public void i_navigate_to_login_page() {
        action.openWebSiteByUrl(Config.loginUrl);
    }

    @When("^I set email$")
    public void i_set_email() {
        loginPage.setEmail("candidatex@gmail.com");
    }

    @Then("^I set password$")
    public void i_set_password() {
        loginPage.setPassword("Qwerty#1995");
    }

    @Then("^I click submit button$")
    public void i_click_submit_button() {
        loginPage.submitLoginForm();
    }

    @Then("^I should see main page displayed$")
    public void i_should_main_page_displayed() {
        Assert.assertTrue(loginPage.isRedirectedToHomePage());
    }
}