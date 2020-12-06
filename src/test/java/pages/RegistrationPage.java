package pages;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.ActionsUtils;

public class RegistrationPage extends BasePage {

    @FindBy(id = "id_email")
    WebElement emailInput;
    @FindBy(xpath = "//*[@class='alert alert-danger'")
    WebElement alert;
    @FindBy(id = "onetrust-accept-btn-handler")
    WebElement rejectAddsButton;

    public RegistrationPage(ActionsUtils actions) {
        super(actions);
    }

    public void setEmail(String email) {
        actions.sendKeys(emailInput, email);
    }

    public boolean isAlertDisplayed() {
        return actions.isElementDisplayed(alert);
    }

    public void rejectAdds(){
       rejectAddsButton.click();
    }

}
