package base;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.ActionsUtils;

public class BasePage {

    @FindBy(xpath = "")
    WebElement homePageHeader;

    protected ActionsUtils actions;

    public BasePage(ActionsUtils actions) {
        PageFactory.initElements(actions.getWebDriver(), this);
        this.actions = actions;
    }

    public boolean isRedirectedToHomePage() {
        return actions.isElementDisplayed(homePageHeader);
    }

}