package pages;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.ActionsUtils;

public class BasketPage extends BasePage {

    @FindBy(id = "collar")
    private WebElement checkBoxCollar;
    @FindBy(id = "toy")
    private WebElement checkBoxChewToy;
    @FindBy(id = "carrier")
    private WebElement checkBoxCarrier;
    @FindBy(id = "vet")
    private WebElement checkBoxVetVisit;
    @FindBy(xpath = "//*[@value = 'Complete the Adoption']")
    private WebElement btnCompleteAdoption;
    @FindBy(xpath = "//*[@value = 'Adopt Another Puppy']")
    private WebElement btnAdoptAnother;
    @FindBy(xpath = "//*[@value = 'Change your mind']")
    private WebElement btnChangeYourMind;

    public BasketPage(ActionsUtils actions) {
        super(actions);
    }

    public void clickCheckBoxCollar(){
        actions.clickWebElement(checkBoxCollar);
    }

    public void clickCheckBoxChewToy(){
        actions.clickWebElement(checkBoxChewToy);
    }

    public void clickCheckBoxCarrier(){
        actions.clickWebElement(checkBoxCarrier);
    }

    public void clickCheckBoxVetVisit(){
        actions.clickWebElement(checkBoxVetVisit);
    }

    public void clickCompleteAdoption(){
        actions.clickWebElement(btnCompleteAdoption);
    }

    public void clickAdoptAnother(){
        actions.clickWebElement(btnAdoptAnother);
    }

    public void clickCompleteChangeYourMind(){
        actions.clickWebElement(btnChangeYourMind);
    }

}