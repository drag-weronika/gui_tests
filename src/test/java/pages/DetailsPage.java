package pages;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.ActionsUtils;

public class DetailsPage extends BasePage {

    @FindBy(xpath = "//*[@value = 'Adopt Me!']")
    private WebElement btnAdoptMe;

    public DetailsPage(ActionsUtils actions) {
        super(actions);
    }

    public void submitAdoption(){
        actions.clickWebElement(btnAdoptMe);
    }

}
