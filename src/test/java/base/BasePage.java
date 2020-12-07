package base;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.ActionsUtils;

public class BasePage {

    @FindBy(id = "onetrust-accept-btn-handler")
    WebElement rejectAddsButton;
    @FindBy(xpath = "//*[@class='alert alert-danger']")
    WebElement alert;

    protected ActionsUtils actions;

    public BasePage(ActionsUtils actions) {
        PageFactory.initElements(actions.getWebDriver(), this);
        this.actions = actions;
    }

    public void rejectAdds() {
        if (actions.isElementDisplayed(rejectAddsButton)) {
            rejectAddsButton.click();
        }
    }

    public boolean isAlertDisplayed() {
        return actions.isElementDisplayed(alert);
    }

}
