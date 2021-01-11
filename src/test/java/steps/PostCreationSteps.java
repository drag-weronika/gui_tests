package steps;

import base.BasePage;
import base.BaseTest;
import config.Config;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import pages.EditorPage;

public class PostCreationSteps extends BaseTest {
    BasePage homePage;
    EditorPage editorPage;

    @Before(value = {"@createPost"})
    public void setUp(Scenario scenario) {
        init(scenario, 10);
        homePage = new BasePage(action);
        editorPage = new EditorPage(action);
    }

    @After(value = {"@createPost"})
    public void tearDown(Scenario scenario) {
        terminate(scenario);
    }

    @Given("^I navigate to home page$")
    public void i_navigate_to_home_page() {
        action.openWebSiteByUrl(Config.baseUrl);
    }

    @And("^I navigate to Editor by link$")
    public void i_navigate_to_Editor_by_link() {
        homePage.navigateToEditor();
    }

    @And("^I set title$")
    public void i_set_title() {
        editorPage.setTitle("Title TC02");
    }

    @And("^I set description$")
    public void i_set_description() {
        editorPage.setDescription("Description TC02");
    }

    @And("^I set content$")
    public void i_set_content() {
        editorPage.setContent("Article TC02");
    }

    @And("^I set tag$")
    public void i_set_tag() {
        editorPage.setTag("TagTC02");
    }

    @When("^I submit posting$")
    public void i_submit_posting() {
        action.waitSec(1);
        editorPage.clickPostingButton();
    }

    @Then("^I should see post created with icons for edition, deletion and commenting$")
    public void i_should_see_post_created_with_icons_for_edition_deletion_and_commenting() {
        action.waitSec(1);
        Assert.assertTrue(action.isDisplayed("//h1[contains(text(),'Title TC02')]"));
        Assert.assertTrue(action.isDisplayed("//p[contains(text(),'Article TC02')]"));
        Assert.assertTrue(action.isDisplayed("//i[@class='ion-edit']"));
        Assert.assertTrue(action.isDisplayed("//i[@class='ion-trash-a']"));
        Assert.assertTrue(action.isDisplayed("//*[@placeholder='Write a comment...']"));
        Assert.assertTrue(action.isDisplayed("//button[@type='submit' and contains(text(),' Post Comment ')]"));
    }

    @And("^I click Global Feed tab$")
    public void i_click_Global_Feed_tab() {
        homePage.clickFeedTab();
    }

    @When("^I should see the post listed$")
    public void i_should_see_the_post_listed() {
        action.waitSec(1);
        Assert.assertTrue(action.isDisplayed("//h1[contains(text(),'Title TC02')]"));
    }

}