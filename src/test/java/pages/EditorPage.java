package pages;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.ActionsUtils;

public class EditorPage extends BasePage {

    @FindBy(xpath = "//input[@placeholder='Article Title']")
    WebElement titleInput;
    @FindBy(xpath = "//input[@placeholder=\"What's this article about?\"]")
    WebElement descriptionInput;
    @FindBy(xpath = "//textarea[@placeholder=\"Write your article (in markdown)\"]")
    WebElement contentInput;
    @FindBy(xpath = "//input[@placeholder='Enter Tags']")
    WebElement tagsInput;
    @FindBy(xpath = "//button[@type='button' and contains(text(), ' Publish Article ')]")
    WebElement postArticleBtn;

    public EditorPage(ActionsUtils actions) {
        super(actions);
    }

    public void setTitle(String title) {
        actions.waitForElementToBeClickable(titleInput);
        actions.sendKeys(titleInput, title);
    }

    public void setDescription(String description) {
        actions.sendKeys(descriptionInput, description);
    }

    public void setContent(String content) {
        actions.sendKeys(contentInput, content);
    }

    public void setTag(String tag) {
        actions.sendKeys(tagsInput, tag);
    }

    public void clickPostingButton() {
        actions.clickWebElement(postArticleBtn);
    }

}