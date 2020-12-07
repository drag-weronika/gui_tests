package pages;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.ActionsUtils;

public class LoginPage extends BasePage {

    @FindBy(id = "id_username_or_email")
    WebElement emailInput;
    @FindBy(id = "id_password")
    WebElement passwordInput;
    @FindBy(xpath = "//*[@name='submit']")
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
        submitBtn.click();
    }

}
