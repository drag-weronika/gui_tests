package steps;

import base.BaseTest;
import config.Config;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import org.junit.Assert;
import pages.*;

import java.util.List;

public class AdoptionSteps extends BaseTest {

    HomePage homePage;
    DetailsPage detailsPage;
    BasketPage basketPage;
    OrdersDetailsPage ordersDetailsPage;

    List<String> puppiesToChoose;
    String randomPuppy1;
    String randomPuppy2;

    @Before(value = {"@tests"})
    public void setUp(Scenario scenario) {
        init(scenario, 10);
        homePage = new HomePage(action);
        detailsPage = new DetailsPage(action);
        basketPage = new BasketPage(action);
        ordersDetailsPage = new OrdersDetailsPage(action);
    }

    @After(value = {"@tests"})
    public void tearDown(Scenario scenario) {
        terminate(scenario);
    }

    @And("^I navigate to the HomePage$")
    public void i_navigate_to_the_HomePage() {
        action.openWebSiteByUrl(Config.baseUrl);
        homePage.isHomePageVisible();
    }

    @And("^I open Brook details card$")
    public void i_open_Brook_details_card() {
        homePage.goToPuppyDetails("Brook");
    }

    @And("^I submit adoption$")
    public void i_submit_adoption() {
        detailsPage.submitAdoption();
    }

    @And("^I set Chewy Toy in basket$")
    public void i_set_Chewy_Toy_in_basket() {
        basketPage.clickCheckBoxChewToy();
    }

    @And("^I set Travel Carrier in basket$")
    public void i_set_Travel_Carrier_in_basket() {
        basketPage.clickCheckBoxCarrier();
    }

    @And("^I complete adoption$")
    public void i_complete_adoption() {
        basketPage.clickCompleteAdoption();
    }

    @And("^I enter personal details$")
    public void i_enter_personal_details() {
        action.waitSec(1);
        ordersDetailsPage.setOrderNameInput("Order Name");
        ordersDetailsPage.setAddressInput("Address");
        ordersDetailsPage.setEmailInput("candidatex@gmail.com");
    }

    @And("^I set payment method to Check$")
    public void i_set_payment_method() {
        ordersDetailsPage.setPaymentMethod("Check");
    }

    @And("^I place order$")
    public void i_place_order() {
        ordersDetailsPage.submitOrder();
    }

    @And("^I assert info of successful adoption is displayed$")
    public void i_assert_info_ofSuccessful_adoption_is_displayed() {
        Assert.assertTrue(homePage.iaAdoptionSuccessful());
    }

    @And("^I open Sparky details card$")
    public void i_open_Hanna_details_card() {
        homePage.goToPuppyDetails("Sparky");
    }

    @And("^I set Collar & Leash in basket$")
    public void i_set_Collar_Leash_in_basket() {
        basketPage.clickCheckBoxCollar();
    }

    @And("^I set payment method to Credit Card$")
    public void i_set_payment_method_to_Credit_Card() {
        ordersDetailsPage.setPaymentMethod("Credit card");
    }

    @And("^I choose randomly two puppies$")
    public void i_choose_randomly_two_puppies() {
        puppiesToChoose = homePage.getListOfPuppies();
        randomPuppy1 = homePage.getRandomPuppy(puppiesToChoose);
        randomPuppy2 = homePage.getRandomPuppy(puppiesToChoose);
    }

    @And("^I open first randomly choosen details card$")
    public void i_open_first_randomly_choosen_details_card() {
        action.openWebSiteByUrl(Config.baseUrl);
        homePage.goToPuppyDetails(randomPuppy1);
    }

    @And("^I continue adoption$")
    public void i_continue_adoption() {
        basketPage.clickAdoptAnother();
    }

    @And("^I open second randomly details card$")
    public void i_open_second_randomly_details_card() {
        homePage.goToPuppyDetails(randomPuppy2);
    }

    @And("^I check Collar & Lash for each$")
    public void i_check_Collar_Lash_for_each() {
        action.clickByXpath("(//*[@id='collar'])[1]");
        action.clickByXpath("(//*[@id='collar'])[2]");
    }

}