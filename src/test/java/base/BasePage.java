package base;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.ActionsUtils;

public class BasePage {

    @FindBy(xpath = "//h1[@class='logo-font' and contains(text(),'BBlog')]")
    WebElement homeHeader;
    @FindBy(xpath = "//a[@class='nav-link' and @href=\"#/editor\"]")
    WebElement newPostLink;
    @FindBy(xpath = "//a[@class='nav-link' and contains(text(),'Global Feed')]")
    WebElement globalFeedTab;

    protected ActionsUtils actions;

    public BasePage(ActionsUtils actions) {
        PageFactory.initElements(actions.getWebDriver(), this);
        this.actions = actions;
    }

    public boolean isRedirectedToHomePage() {
        actions.waitForElementToBeVisible(homeHeader);
        return actions.isElementDisplayed(homeHeader);
    }

    public void clickFeedTab() {
        actions.clickWebElement(globalFeedTab);
    }

    public void navigateToEditor() {
        actions.clickWebElement(newPostLink);
    }

}