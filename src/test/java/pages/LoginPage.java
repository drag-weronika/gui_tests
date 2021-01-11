package pages;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.ActionsUtils;

public class LoginPage extends BasePage {

    @FindBy(xpath = "//input[@placeholder='Username']")
    WebElement emailInput;
    @FindBy(xpath = "//input[@placeholder='Password']")
    WebElement passwordInput;
    @FindBy(xpath = "//*[@type='submit']")
    WebElement submitBtn;

    public LoginPage(ActionsUtils actions) {
        super(actions);
    }

    public void setEmail(String email) {
        actions.sendKeys(emailInput, email);
    }

    public void setPassword(String password) {
        actions.sendKeys(passwordInput, password);
    }

    public void submitLoginForm() {
        actions.waitSec(1);
        actions.clickWebElement(submitBtn);
    }

}