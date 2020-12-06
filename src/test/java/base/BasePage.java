package base;

import org.openqa.selenium.support.PageFactory;
import utils.ActionsUtils;

public class BasePage {

    protected ActionsUtils actions;

    public BasePage(ActionsUtils actions) {
        PageFactory.initElements(actions.getWebDriver(), this);
        this.actions = actions;
    }



}
