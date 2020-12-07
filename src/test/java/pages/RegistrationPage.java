package pages;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.ActionsUtils;

public class RegistrationPage extends BasePage {

    @FindBy(id = "id_email")
    WebElement emailInput;

    public RegistrationPage(ActionsUtils actions) {
        super(actions);
    }

    public void setEmail(String email) {
        actions.sendKeys(emailInput, email);
    }

}
