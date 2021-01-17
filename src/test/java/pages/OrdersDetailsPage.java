package pages;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.ActionsUtils;

public class OrdersDetailsPage extends BasePage {

    @FindBy(id = "order_name")
    private WebElement orderNameInput;
    @FindBy(id = "order_address")
    private WebElement addressInput;
    @FindBy(id = "order_email")
    private WebElement emailInput;
    @FindBy(id = "order_pay_type")
    private WebElement optionOrderPayType;
    @FindBy(xpath = "//*[@value='Place Order']")
    private WebElement btnPlaceOrder;

    public OrdersDetailsPage(ActionsUtils actions) {
        super(actions);
    }

    public void setOrderNameInput(String name) {
        actions.sendKeys(orderNameInput, name);
    }

    public void setAddressInput(String address) {
        actions.sendKeys(addressInput, address);
    }

    public void setEmailInput(String email) {
        actions.sendKeys(emailInput, email);
    }

    public void setPaymentMethod(String paymentMethod) {
        actions.clickWebElement(optionOrderPayType);
        actions.waitSec(1);
        actions.clickByXpath(".//*[@value='" + paymentMethod + "']");
    }

    public void submitOrder() {
        actions.clickWebElement(btnPlaceOrder);
    }

}